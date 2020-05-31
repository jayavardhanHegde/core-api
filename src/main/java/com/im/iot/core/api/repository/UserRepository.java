package com.im.iot.core.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.im.iot.core.api.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	//public void saveUser(User user);

}
