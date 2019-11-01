package com.apollo.rest.webservice.restfulwebservice.markers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MarkerComponent implements CommandLineRunner{
	
	@Autowired
	private MarkerJPARepository markerRepository;
	
	public void run(String... arg0) throws Exception{
		Marker markerCircle=new Marker("52","22","circle","ready");
		Marker markerSquare=new Marker("53","15","square","problem");
		Marker markerTriangle=new Marker("54","18","triangle","crash");
		
		markerRepository.save(markerCircle);
		markerRepository.save(markerSquare);
		markerRepository.save(markerTriangle);
	}
}
