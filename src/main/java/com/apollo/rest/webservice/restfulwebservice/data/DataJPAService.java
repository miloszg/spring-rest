package com.apollo.rest.webservice.restfulwebservice.data;

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
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:4200"})
public class DataJPAService {
	
	@Autowired
	private DataJPARepository dataRepository;
	
	@GetMapping("/jpa/data")
	public List<Data> getAllData(){
		return dataRepository.findAll();
	}
	
	@GetMapping("/jpa/data/{id}")
	public Data getData(@PathVariable int id){
		return dataRepository.findById(id).get();
	}
	
	@DeleteMapping("/jpa/data/{id}")
	public ResponseEntity<Void> deleteData(@PathVariable int id){
		dataRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
//	@PutMapping("/jpa/marker/{id}")
//	public ResponseEntity<Param> updateMarker(@PathVariable long id, @RequestBody Param LatLng){
//		Optional<Param> op = markerRepository.findById(id);
//		Param updatedMarker = op.get();
//		updatedMarker.setLongitude(LatLng.getLongitude());
//		updatedMarker.setLatitude(LatLng.getLatitude());
//		markerRepository.save(updatedMarker);
//		return new ResponseEntity<Param>(updatedMarker, HttpStatus.OK);
//	}
//	
//	@PostMapping("/jpa/markers")
//	public ResponseEntity<Void> createMarker(@RequestBody Param marker){
//		Param createdMarker=markerRepository.save(marker);
//		
//		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdMarker.getId()).toUri();
//		return ResponseEntity.created(uri).build();
//	}
}
