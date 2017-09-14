package com.spring.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.common.Login;
import com.spring.common.Student;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String home(@ModelAttribute("login")Login login,
					   Model model) {
		logger.info("Logging in for user {}.", login.getUsername());
		
		Student student = new Student("Zakir", 28, 8059);
		
		if(validatePassword(login)) {
			model.addAttribute("student", student);
//			model.addAttribute("name", "Zakir" );
//			model.addAttribute("age", "28");
//			model.addAttribute("rollNo", "8059");
			
			return "loginSuccess";
		}else {
			model.addAttribute("message", "User login was unsuccessful for "+login.getUsername());
			return "loginFail";
		}
	}
	
	private boolean validatePassword(Login login) {
		if("zakir".equals(login.getUsername()) && "reset123".equals(login.getPassword())){
			return true;
		}
		return false;
	}
	
}
