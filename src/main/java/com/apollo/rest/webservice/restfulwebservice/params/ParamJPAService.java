package com.apollo.rest.webservice.restfulwebservice.params;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://192.168.2.101:8080"})
public class ParamJPAService {
	
	@Autowired
	private ParamJPARepository paramsRepository;
	
	@GetMapping("/jpa/params")
	public List<Param> getAllParams(){
		return paramsRepository.findAll();
	}
	
	@GetMapping("/jpa/params/{id}")
	public Param getParam(@PathVariable int id){
		return paramsRepository.findById(id).get();
	}
	
	@DeleteMapping("/jpa/params/{id}")
	public ResponseEntity<Void> deleteParam(@PathVariable int id){
		paramsRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping("/jpa/params")
	public ResponseEntity<Void> createParam(@RequestBody Param param){
		System.out.println(param.getVmax());
		System.out.println(param.getVmin());
		Param createdParam=paramsRepository.save(param);
		
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdParam.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	
	
}
