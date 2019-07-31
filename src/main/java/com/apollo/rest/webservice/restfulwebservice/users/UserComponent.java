package com.apollo.rest.webservice.restfulwebservice.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserComponent implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	public void run(String... arg0) throws Exception{
		User mainUser=new User("admin", "admin");

		userRepository.save(mainUser);
		
	}
}
