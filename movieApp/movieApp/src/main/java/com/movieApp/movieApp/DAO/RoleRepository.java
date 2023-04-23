package com.movieApp.movieApp.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movieApp.movieApp.entities.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
    
}
