package com.apollo.rest.webservice.restfulwebservice.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name="username")
	private String username;
	
	@Column(name="language")
	private String language;
	
	@Column(name="menu_option")
	private String menuOption;
	
	@Column(name="link")
	private String link;
	
	public User() {
	}
	 
	public User(String username, String menuOption, String link,String language) {
		this.username = username;
		this.menuOption = menuOption;
		this.link=link;
		this.language=language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Long getId() {
		return id;
	}
	
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMenuOption() {
		return menuOption;
	}

	public void setMenuOption(String menuOption) {
		this.menuOption = menuOption;
	}


	
	
	
}
