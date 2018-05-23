package org.itbam.recourses.resources;

import java.util.List;

import org.itbam.recourses.repository.Recourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recourses")
public class Recourse {
	
	@Autowired
	private Recourses recourses;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<org.itbam.recourses.model.Recourse> all(){
		return (List<org.itbam.recourses.model.Recourse>) this.recourses.findAll();
	}

}
