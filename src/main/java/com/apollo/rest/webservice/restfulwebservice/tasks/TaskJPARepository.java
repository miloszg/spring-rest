package com.apollo.rest.webservice.restfulwebservice.tasks;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskJPARepository extends JpaRepository<Task,Long>{
	List <Task>findByUsername(String username);

}
