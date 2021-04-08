package com.nokia.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nokia.demo.entity.UserEntity;
import com.nokia.demo.services.UserService;

@RestController
@RequestMapping("/nokia")
public class NokiaController {

	@Autowired
	UserService userService;
	
	@GetMapping("/test")
	public String test() {
		return "Nokia is running ";
	}
	
	
	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody UserEntity request) {
		return userService.createUser(request);
	}
	
	@GetMapping("/get/user/{id}")
	public ResponseEntity<?> getUser(@PathVariable("id") Long id) {
		return userService.getUser(id);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateUser(@RequestBody UserEntity request) {
		return userService.updateUser(request);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
		return userService.deleteUser(id);
	}
	
	
}
