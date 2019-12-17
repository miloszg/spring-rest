package com.apollo.rest.webservice.restfulwebservice.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJPARepository extends JpaRepository<Employee,Long>{
	List <Employee>findByUsername(String username);

}
