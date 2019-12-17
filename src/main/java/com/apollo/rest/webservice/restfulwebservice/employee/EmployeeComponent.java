package com.apollo.rest.webservice.restfulwebservice.employee;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.apollo.rest.webservice.restfulwebservice.employee.Employee;

@Component
public class EmployeeComponent implements CommandLineRunner{
	
	@Autowired
	private EmployeeJPARepository employeeRepository;
	
	
	
	public void run(String... arg0) throws Exception{
		
//				SessionFactory factory = new Configuration()
//				.configure("hibernate.cfg.xml")
//				.addAnnotatedClass(Employee.class)
//				.buildSessionFactory();
//		 
//		//create session
//		Session session = factory.getCurrentSession();
//		try {
//			//start transaction
//			session.beginTransaction();
//			
//			//get instructor by primary key
//			Employee employeeAdmin = session.get(Employee.class,1);
//			System.out.println(employeeAdmin.getRole());
//			employeeRepository.save(employeeAdmin);
//			
//			//commit transaction
//			session.getTransaction().commit();
//			System.out.println("Done! ");
//			
//		} finally {
//			factory.close();
//		}
//
//		
		
		Employee adminEmployee=new Employee("admin","admin","admin");
		Employee workerEmployee=new Employee("worker","worker","worker");
		Employee managerEmployee=new Employee("manager","manager","manager");
		
		employeeRepository.save(adminEmployee);
		employeeRepository.save(workerEmployee);
		employeeRepository.save(managerEmployee);
	}
	
	public static void getEmployees() {
		
				
		
	}
}
