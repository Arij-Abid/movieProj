package com.movieApp.movieApp.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movieApp.movieApp.entities.User;



@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
