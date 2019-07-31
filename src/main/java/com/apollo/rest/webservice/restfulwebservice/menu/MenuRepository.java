package com.apollo.rest.webservice.restfulwebservice.menu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuOption,Long> {
	List <MenuOption>findByUsername(String username);
}
