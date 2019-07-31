package com.apollo.rest.webservice.restfulwebservice.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MenuComponent implements CommandLineRunner{
	
	@Autowired
	private MenuRepository menuRepository;
	
	public void run(String... arg0) throws Exception{
		MenuOption menu_home_en=new MenuOption("admin", "Home","/welcome","en");
		MenuOption menu_home_pl=new MenuOption("admin", "Strona Główna","/welcome","pl");
		MenuOption menu_home_de=new MenuOption("admin", "Startseite","/welcome","de");
		
		MenuOption menu_tasks_en=new MenuOption("admin", "Tasks","/tasks","en");
		MenuOption menu_tasks_pl=new MenuOption("admin", "Zadania","/tasks","pl");
		MenuOption menu_tasks_de=new MenuOption("admin", "Aufgaben","/tasks","de");
		menuRepository.save(menu_home_en);
		menuRepository.save(menu_home_pl);
		menuRepository.save(menu_home_de);
		menuRepository.save(menu_tasks_en);
		menuRepository.save(menu_tasks_pl);
		menuRepository.save(menu_tasks_de);
	}
}
