package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmail {
	private static Properties props = new Properties();

	static {
		loadProperties();
	}

	static void loadProperties() {
		try {
			InputStream is = SendEmail.class.getResourceAsStream("/META-INF/mail.properties");
			props.load(is);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void sendActivation(String to, String codeActivation) {
		String subject = "Bem vindo! Ative sua conta...";

		MimeMultipart multipart = new MimeMultipart();
		BodyPart messageBodyPart = new MimeBodyPart();

		try {
			//Set key values
			Map<String, String> input = new HashMap<String, String>();
			input.put("Author", "java2db.com");
			input.put("Topic", "HTML Template for Email");
			input.put("Content In", "English");

			//HTML mail content
			String htmlText = readEmailFromHtml("/META-INF/templateActivationCode.html", input);
			messageBodyPart.setContent(htmlText, "text/html");

			multipart.addBodyPart(messageBodyPart);
		} catch (MessagingException ex) {
			ex.printStackTrace();
		} catch (Exception ae) {
			ae.printStackTrace();
		}

		send(to, subject, multipart);
	}

	public static void send(String to, String subject, MimeMultipart body) {

		loadProperties();
		String from = props.getProperty("mail.from");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(props.getProperty("mail.smtp.user"),
						props.getProperty("mail.smtp.pass"));

			}
		});

		/** Ativa Debug para sessão */
		session.setDebug("true".equals(props.getProperty("mail.debug")));

		try {

			Message message = new MimeMessage(session);
			//Remetente
			message.setFrom(new InternetAddress(from));

			//Destinatário(s)
			Address[] toUser = InternetAddress.parse(to);

			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject(subject);//Assunto
			message.setContent(body);

			/**Método para enviar a mensagem criada*/
			Transport.send(message);

			System.out.println("Email Sent!");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	//Method to replace the values for keys
	protected static String readEmailFromHtml(String filePath, Map<String, String> input) {
		String msg = readContentFromFile(filePath);
		try {
			Set<Entry<String, String>> entries = input.entrySet();
			for (Map.Entry<String, String> entry : entries) {
				msg = msg.replace(entry.getKey().trim(), entry.getValue().trim());
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return msg;
	}

	//Method to read HTML file as a String 
	private static String readContentFromFile(String fileName) {
		StringBuffer contents = new StringBuffer();

		try {
			//use buffering, reading one line at a time
			InputStream i = SendEmail.class.getResourceAsStream(fileName);
			BufferedReader reader = new BufferedReader(new InputStreamReader(i));
			try {
				String line = null;
				while ((line = reader.readLine()) != null) {
					contents.append(line);
					contents.append(System.getProperty("line.separator"));
				}
			} finally {
				reader.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return contents.toString();
	}

}
