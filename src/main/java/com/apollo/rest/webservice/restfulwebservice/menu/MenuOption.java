package com.apollo.rest.webservice.restfulwebservice.menu;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.apollo.rest.webservice.restfulwebservice.users.User;


@Entity
@Table(name="menu_option")
public class MenuOption {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name="username")
	private String username;
	
	@Column(name="language")
	private String language;
	
	@Column(name="menu_option")
	private String menuOption;
	
	@Column(name="link")
	private String link;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="user_id")
	private User user;
	
	public MenuOption() {
	}
	 
	public MenuOption(String username, String menuOption, String link,String language) {
		this.username = username;
		this.menuOption = menuOption;
		this.link=link;
		this.language=language;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "MenuOption [id=" + id + ", username=" + username + ", language=" + language + ", menuOption="
				+ menuOption + ", link=" + link + "]";
	}


	
	
	
}
