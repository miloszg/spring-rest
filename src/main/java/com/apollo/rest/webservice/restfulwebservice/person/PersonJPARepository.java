package com.apollo.rest.webservice.restfulwebservice.person;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonJPARepository extends JpaRepository<Person,Long>{
	List <Person>findByUsername(String username);

}
