package com.nokia.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nokia.demo.entity.UserEntity;
import com.nokia.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	public ResponseEntity<?> createUser(UserEntity entity) {
		try{
			UserEntity newEntity = userRepo.save(entity);
			return new ResponseEntity<UserEntity>(newEntity,HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<?> getUser(Long id) {
		try{
			Optional<UserEntity> user = userRepo.findById(id);
			return new ResponseEntity<Object>(user,HttpStatus.CREATED);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<?> updateUser(UserEntity entity) {
	    try{
	        Optional<UserEntity> e = userRepo.findById(entity.getId());
	    	if(e == null) {
	    		return new ResponseEntity<Object>(null,HttpStatus.NO_CONTENT);
	    	} 
	    	UserEntity user = e.get();
	    	user.setPhone(entity.getPhone());
	    	user.setAddress(entity.getAddress());
	    	user.setCountry(entity.getCountry());
	    	user.setDepartment(entity.getDepartment());
	    	user.setEmail(entity.getEmail());
	    	user.setName(entity.getName());
	    	
	    	UserEntity newUser = userRepo.save(user);
	    	return new ResponseEntity<Object>(newUser,HttpStatus.OK);
	    	
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }
		return null;
	}

	@Override
	public ResponseEntity<?> deleteUser(Long id) {
		try{
			Optional<UserEntity> e = userRepo.findById(id);
			if(e == null){
				return new ResponseEntity<Object>(null,HttpStatus.NO_CONTENT);
			} else {
				userRepo.deleteById(id);
				return new ResponseEntity<Object>("User Deleted",HttpStatus.OK);
			}
			
		} catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}

}
