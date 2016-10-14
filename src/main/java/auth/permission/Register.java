package auth.permission;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
  public User UsersButton95680NgClick(@RequestBody Map<String, Object> object) throws Exception {
    User userToRegister = new User();
    userToRegister.setName(object.get("name").toString());
    userToRegister.setLogin(object.get("login").toString());
    userToRegister.setPassword(object.get("password").toString());
    userToRegister.setEmail(object.get("email").toString());
    userToRegister = userBusiness.post(userToRegister);
	  
	  SendEmail.sendActivation(userToRegister.getEmail(), userToRegister.getCodigoAtivacao());
	  
    return userToRegister;
  }

}
