package com.nokia.demo.services;

import org.springframework.http.ResponseEntity;

import com.nokia.demo.entity.UserEntity;

public interface UserService {

	public ResponseEntity<?> createUser(UserEntity entity);
	
	public ResponseEntity<?> getUser(Long id);
	
	public ResponseEntity<?> updateUser(UserEntity entity);
	
	public ResponseEntity<?> deleteUser(Long id);
	
}
