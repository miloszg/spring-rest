package com.apollo.rest.webservice.restfulwebservice.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PersonComponent implements CommandLineRunner{
	
	@Autowired
	private PersonJPARepository personRepository;
	
	public void run(String... arg0) throws Exception{
		Person adminPerson=new Person("admin","admin","admin");
		Person workerPerson=new Person("worker","worker","worker");
		Person managerPerson=new Person("manager","manager","manager");
		
		personRepository.save(adminPerson);
		personRepository.save(workerPerson);
		personRepository.save(managerPerson);
	}
}
