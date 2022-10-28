package com.flight_reservation_app_5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app_5.Repository.UserRepository;
import com.flight_reservation_app_5.entity.user;

@Controller
public class userController {
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/ShowLoginpage")
	public String ShowLoginpage() {
		return "login/login";
		
	}
	
	
	@RequestMapping("/showReg")
	public String showReg() {
	return "login/showReg";
	}
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user") user user) {
		userRepo.save(user);
		return "login/login";
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailid") String emailid,@RequestParam("password") String password,ModelMap model) {
		user user = userRepo.findByEmail(emailid);
		if(user!=null) {
		if(user.getEmail().equals(emailid)&& user.getPassword().equals(password)) {
			return "findFlights";
		}else {
			model.addAttribute("error1", "invalid username /password");
			return "login/login";
		}
		}else {
			model.addAttribute("error1", "invalid username /password");
			return "login/login";
	   }
	}
}


