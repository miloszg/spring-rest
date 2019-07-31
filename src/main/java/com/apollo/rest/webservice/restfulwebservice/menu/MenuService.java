package com.apollo.rest.webservice.restfulwebservice.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MenuService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	@GetMapping("/jpa/users/{username}/menu-option/{id}")
	public MenuOption getMenuOption(@PathVariable String username,@PathVariable long id){
		return menuRepository.findById(id).get();
	}
	
	@GetMapping("/jpa/users/{username}/menu-options")
	public List<MenuOption> getAllMenuOptions(@PathVariable String username){
		return menuRepository.findByUsername(username);
	}
	
}

