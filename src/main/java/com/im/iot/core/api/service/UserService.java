/**
 * 
 */
package com.im.iot.core.api.service;

import java.time.LocalDateTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.im.iot.core.api.entity.User;
import com.im.iot.core.api.repository.RoleRepository;
import com.im.iot.core.api.repository.UserRepository;
import com.im.iot.core.api.util.RepositoryUtil;

/**
 * @author jayavardhan
 *
 */
@Service
public class UserService {
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RepositoryUtil repositoryUtil;

	public void createUser(User user) throws Exception{
		try {
			user.setRole(repositoryUtil.getRoleById(user.getRoleId()));
		}catch (Exception e) {
			throw e;
		}
		
		user.setCreatedOn(LocalDateTime.now());
		user.setUpdateOn(LocalDateTime.now());
		
		userRepository.save(user);
	}
}
