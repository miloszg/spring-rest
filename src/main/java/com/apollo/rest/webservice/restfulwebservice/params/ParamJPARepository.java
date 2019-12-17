package com.apollo.rest.webservice.restfulwebservice.params;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParamJPARepository extends JpaRepository<Param,Integer>{
	Optional<Param> findById(int id);

}
