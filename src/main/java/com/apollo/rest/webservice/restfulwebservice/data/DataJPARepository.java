package com.apollo.rest.webservice.restfulwebservice.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataJPARepository extends JpaRepository<Data,Integer>{
	Optional<Data> findById(int id);

}
