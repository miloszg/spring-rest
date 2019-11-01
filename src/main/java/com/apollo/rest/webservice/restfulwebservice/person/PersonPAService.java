package com.apollo.rest.webservice.restfulwebservice.person;

import java.net.URI;
import java.util.List;

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
@CrossOrigin(origins="http://localhost:3000")
public class PersonPAService {
	
	@Autowired
	private PersonJPARepository personRepository;
	
	@GetMapping("/jpa/persons")
	public List<Person> getAllTasks(){
		return personRepository.findAll();
	}
	
	@GetMapping("/jpa/persons/{id}")
	public Person getTask(@PathVariable long id){
		return personRepository.findById(id).get();
	}
	
//	@DeleteMapping("/jpa/users/{username}/tasks/{id}")
//	public ResponseEntity<Void> deleteTask(@PathVariable String username, @PathVariable long id){
//		taskRepository.deleteById(id);
//		return ResponseEntity.noContent().build();
//	}
	
//	@PutMapping("/jpa/users/{username}/tasks/{id}")
//	public ResponseEntity<Person> updateTask(@PathVariable String username, @PathVariable long id, @RequestBody Person task){
//		task.setUsername(username);
//		taskRepository.save(task);
//		return new ResponseEntity<Person>(task, HttpStatus.OK);
//	}
	
//	@PostMapping("/jpa/users/{username}/tasks")
//	public ResponseEntity<Void> createTask(@PathVariable String username, @RequestBody Person task){
//		task.setUsername(username);
//		Person createdTask=taskRepository.save(task);
//		
//		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdTask.getId()).toUri();
//		return ResponseEntity.created(uri).build();
//	}
	
	
	
	
	
	
	
}
