package com.apollo.rest.webservice.restfulwebservice.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/jpa/users/{username}/{id}")
	public User getUser(@PathVariable String username,@PathVariable long id){
		return userRepository.findById(id).get();
	}
	
	@GetMapping("/jpa/users/{username}/info")
	public List<User> getAllUsers(@PathVariable String username){
		return userRepository.findByUsername(username);
	}
	
}

