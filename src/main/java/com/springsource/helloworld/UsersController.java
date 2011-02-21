package com.springsource.helloworld;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsersController {
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public String listAllUsers(Model model) {
		System.out.println("List user request received!");
		List<String> userList = new ArrayList<String>();
		userList.add("Chris");
		userList.add("Adam");
		userList.add("Keith");
		userList.add("Arial");
		userList.add("Matt");
		model.addAttribute("userList", userList);
		return "users";
	}

	
}
