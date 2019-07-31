package com.apollo.rest.webservice.restfulwebservice.users;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.apollo.rest.webservice.restfulwebservice.menu.MenuOption;


@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name="username")
	private String username;	
	@Column(name="role")
	private String role;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private List<MenuOption> menuOptions;
	
	public User() {
	}
	 
	public User(String username, String role) {
		this.username = username;
		this.role = role;	
	}

	public Long getId() {
		return id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	
	public List<MenuOption> getMenuOptions() {
		return menuOptions;
	}

	public void setMenuOptions(List<MenuOption> menuOptions) {
		this.menuOptions = menuOptions;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", role=" + role + "]";
	}

}
