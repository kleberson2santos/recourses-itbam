package org.itbam.recourses.resources;


import org.itbam.recourses.repository.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class User {
	
	@Autowired
	private Users users;
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<org.itbam.recourses.model.User> all() {
		return this.users.findAll();
	}
	
}
