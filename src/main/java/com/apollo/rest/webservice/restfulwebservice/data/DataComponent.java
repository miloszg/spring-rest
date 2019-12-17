package com.apollo.rest.webservice.restfulwebservice.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataComponent implements CommandLineRunner{
	
	@Autowired
	private DataJPARepository dataRepository;
	
	public void run(String... arg0) throws Exception{
		
		Data data1= new Data("15-12-2019", 100, 120, 125, 80, 1, 1, 1, 10, 20, 30, 40,
				1, 2, 3, 4, 50, 51, 52, 52, 30, 31, 32,33);
		Data data2= new Data("08-12-2019", 100, 130, 130, 80, 1, 1, 1, 10, 20, 30, 40,
				1, 2, 3, 4, 50, 51, 52, 52, 30, 31, 32,33);
		Data data3= new Data("11-12-2019", 105, 125, 123, 80, 1, 1, 1, 10, 20, 30, 40,
				1, 2, 3, 4, 50, 51, 52, 52, 30, 31, 32,33);

		dataRepository.save(data1);
		dataRepository.save(data2);
		dataRepository.save(data3);
	}
}
