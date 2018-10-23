package co.simplon.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import co.simplon.springboot.web.service.LoginService;

@Controller
@ComponentScan({"co.simplon.login.service.LoginService"})
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)//post
	public String showLoginPage(ModelMap model){
	return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	
	public String showWelcomePage(ModelMap model, @RequestParam String name,
			@RequestParam String password){

			boolean isValidUser = service.validateUser(name, password);

			if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
			}
			
			model.put("name", name);
			model.put("password", password);

			return "welcome";

}
}
