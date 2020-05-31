package com.im.iot.core.api.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.im.iot.core.api.entity.Role;
import com.im.iot.core.api.exception.EntityNotFoundException;
import com.im.iot.core.api.repository.RoleRepository;

@Component
public class RepositoryUtil {
	
	@Autowired
	private RoleRepository roleRepository;
	
	public Role getRoleById(int id) {
		try {
			return roleRepository.findById(id).get();
		}catch (Exception e) {
			throw new EntityNotFoundException("Specified Role does not Exist", e);
		}
	}

}
