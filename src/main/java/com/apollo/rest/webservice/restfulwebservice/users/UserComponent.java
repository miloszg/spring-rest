package com.apollo.rest.webservice.restfulwebservice.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserComponent implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	public void run(String... arg0) throws Exception{
		User user_en=new User("admin", "Home","/welcome","en");
		User user_en1=new User("admin", "Tasks","/tasks","en");
		User user_pl=new User("admin", "Strona Główna","/welcome","pl");
		User user_pl1=new User("admin", "Zadania","/tasks","pl");
		User user_de=new User("admin", "Startseite","/welcome","de");
		User user_de1=new User("admin", "Aufgaben","/tasks","de");
		userRepository.save(user_en);
		userRepository.save(user_en1);
		userRepository.save(user_pl);
		userRepository.save(user_pl1);
		userRepository.save(user_de);
		userRepository.save(user_de1);
	}
}
