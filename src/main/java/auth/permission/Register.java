package auth.permission;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import app.business.UserBusiness;
import app.entity.User;
import util.SendEmail;

/**
 * Controller responsável por gerir a troca de
 * senha do usuário através de serviço REST
 * 
 * @author Techne
 *
 */
@RestController
@RequestMapping(value = "/register")
public class Register {
  
  @Autowired
  @Qualifier("UserBusiness")
  private UserBusiness userBusiness;
  
  @RequestMapping(method = RequestMethod.POST)
  public User register(@RequestBody Map<String, Object> object) throws Exception {
    User userToRegister = new User();
    userToRegister.setName(object.get("name").toString());
    userToRegister.setLogin(object.get("login").toString());
    userToRegister.setPassword(object.get("password").toString());
    userToRegister.setEmail(object.get("email").toString());
    userToRegister = userBusiness.post(userToRegister);
	  
	  SendEmail.sendActivation(userToRegister.getEmail(), userToRegister.getCodigoAtivacao());
	  
    return userToRegister;
  }
  
  @RequestMapping(method = RequestMethod.GET, value = "/{codeActivation}")
  public void activation(@PathVariable("codeActivation") final java.lang.String code, HttpServletResponse response) throws Exception {
    boolean activated = userBusiness.activate(code);
    if(activated)
      response.sendRedirect("/ativacaoOk.html");
    else
      response.sendRedirect("/index.html");
  }

}
