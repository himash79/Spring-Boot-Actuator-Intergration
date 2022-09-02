package lk.himash.actuator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.himash.actuator.service.UserService;

@RestController
@RequestMapping("/UserApi")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/GetAllUsers")	
	public ResponseEntity<?> getAllUsers() {
		return userService.getAllUsers();
	}
	
}
