package com.exam.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.models.Role;
import com.exam.models.User;
import com.exam.models.UserRole;
import com.exam.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		Set<UserRole> userRoles = new HashSet<>();
		Role role = new Role(); 
		if (user.getEmail().contains("@examme.com")) {
			role.setRoleid(101);
			role.setRolename("ADMIN");
		}
		UserRole userRole = new UserRole(user, role);
		userRoles.add(userRole);
		userService.createUser(user, userRoles);
		return null;

	}
}
