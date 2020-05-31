package com.im.iot.core.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.im.iot.core.api.entity.Role;
import com.im.iot.core.api.entity.User;
import com.im.iot.core.api.repository.RoleRepository;
import com.im.iot.core.api.repository.UserRepository;

@SpringBootApplication
public class ImIotApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(ImIotApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception { Optional<Role>
	 * role = roleRepository.findById(1);
	 * 
	 * User user = new User(); user.setFirstName("Jayavardhan");
	 * user.setLastname("Hegde"); user.setMobileNumber(9845405353L);
	 * user.setEmailId("jayavardhan.hegde@gmail.com"); user.setPassword("Test1234");
	 * user.setBirthDay(LocalDate.of(1988, 9, 03)); user.setRole(role.get());
	 * user.setCreatedOn(LocalDateTime.now());
	 * user.setUpdateOn(LocalDateTime.now());
	 * 
	 * userRepository.save(user); }
	 */
}
