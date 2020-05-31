/**
 * 
 */
package com.im.iot.core.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.im.iot.core.api.entity.User;
import com.im.iot.core.api.exception.EntityNotFoundException;
import com.im.iot.core.api.repository.UserRepository;
import com.im.iot.core.api.service.UserService;

/**
 * @author jayavardhan
 *
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	ResponseEntity<User> createNewUser(@RequestBody User user) {
		try {
			userService.createUser(user);
		}catch (EntityNotFoundException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return (ResponseEntity<User>) new ResponseEntity<>(HttpStatus.CREATED).ok();
	}
}
