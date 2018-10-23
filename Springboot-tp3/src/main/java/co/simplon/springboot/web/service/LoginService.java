package co.simplon.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String userid, String password) {
		// promo3p20, yesSpring
		return userid.equalsIgnoreCase("promo3p20")
		&& password.equalsIgnoreCase("yesSpring");
		}

}
