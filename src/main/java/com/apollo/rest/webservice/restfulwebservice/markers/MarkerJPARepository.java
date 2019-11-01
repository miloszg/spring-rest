package com.apollo.rest.webservice.restfulwebservice.markers;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkerJPARepository extends JpaRepository<Marker,Long>{
	Optional<Marker> findById(Long id);

}
