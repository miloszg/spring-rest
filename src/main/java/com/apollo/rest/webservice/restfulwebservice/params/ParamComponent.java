package com.apollo.rest.webservice.restfulwebservice.params;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ParamComponent implements CommandLineRunner{
	
	@Autowired
	private ParamJPARepository paramRepository;
	
	public void run(String... arg0) throws Exception{
		Param param1=new Param(100,300,4.7f);
		Param param2=new Param(120,350,3.5f);
		Param param3=new Param(130,320,2.5f);
		
		paramRepository.save(param1);
		paramRepository.save(param2);
		paramRepository.save(param3);
	}
}
