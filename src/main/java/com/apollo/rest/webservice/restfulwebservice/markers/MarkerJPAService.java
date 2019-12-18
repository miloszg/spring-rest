package com.apollo.rest.webservice.restfulwebservice.markers;

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
public class MarkerJPAService {
	
	@Autowired
	private MarkerJPARepository markerRepository;
	
	@GetMapping("/jpa/markers")
	public List<Marker> getAllMarkers(){
		return markerRepository.findAll();
	}
	
	@GetMapping("/jpa/marker/{id}")
	public Marker getMarker(@PathVariable long id){
		return markerRepository.findById(id).get();
	}
	
	@DeleteMapping("/jpa/marker/{id}")
	public ResponseEntity<Void> deleteMarker(@PathVariable long id){
		markerRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/jpa/marker/{id}")
	public ResponseEntity<Marker> updateMarker(@PathVariable long id, @RequestBody Marker LatLng){
		Optional<Marker> op = markerRepository.findById(id);
		Marker updatedMarker = op.get();
		updatedMarker.setLongitude(LatLng.getLongitude());
		updatedMarker.setLatitude(LatLng.getLatitude());
		markerRepository.save(updatedMarker);
		return new ResponseEntity<Marker>(updatedMarker, HttpStatus.OK);
	}
	
	@PostMapping("/jpa/markers")
	public ResponseEntity<Void> createMarker(@RequestBody Marker marker){
		Marker createdMarker=markerRepository.save(marker);
		
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdMarker.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
