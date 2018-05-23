package org.itbam.recourses.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class User extends AbstractPersistable<Long> {

	@Column(unique = true)
	private String username;

	private String password;

	public User() {
		this(null);
	}

	public User(Long id) {
		this.setId(id);
	}

	public String getUsername() {

		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setFirstname(String password) {
		this.password = password;
	}

}