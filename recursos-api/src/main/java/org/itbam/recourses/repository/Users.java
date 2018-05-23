package org.itbam.recourses.repository;

import org.itbam.recourses.model.User;
import org.springframework.data.repository.CrudRepository;

public interface Users extends CrudRepository<User, Long> {


}