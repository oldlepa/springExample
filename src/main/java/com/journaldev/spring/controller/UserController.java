package com.journaldev.spring.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.journaldev.spring.model.Employee;
import com.journaldev.spring.model.User;

@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	Map<Integer, User> userData = new HashMap<Integer, User>();
	
	@RequestMapping(value = EmpRestURIConstants.DUMMY_USER, method = RequestMethod.GET)
	public @ResponseBody User getDiopUser() {
		logger.info("Start getOusmaneUser");
		User user = new User();
		user.setAge(15);
		user.setNom("DIOP");
		user.setPrenom("Ousmane");
		userData.put(1, user);
		return user;
	}

}
