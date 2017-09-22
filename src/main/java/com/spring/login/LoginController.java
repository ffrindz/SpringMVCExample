package com.spring.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.common.Login;
import com.spring.service.StudentService;

/**
 * Handles requests for the login page.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	private StudentService studentService;
	
	@Autowired(required=true)
	@Qualifier(value="studentService")
	public void setStudentService(StudentService ps){
		this.studentService = ps;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String home(@ModelAttribute("login") Login login, Model model) {
		logger.info("Logging in for user {}.", login.getUsername());
		
		if (validatePassword(login)) {
			model.addAttribute("student", this.studentService.listStudents());
			return "loginSuccess";
		} else {
			model.addAttribute("message", "User login was unsuccessful for " + login.getUsername());
			return "loginFail";
		}
	}

	private boolean validatePassword(Login login) {
		if ("zakir".equals(login.getUsername()) && "reset123".equals(login.getPassword())) {
			return true;
		}
		return false;
	}

}
