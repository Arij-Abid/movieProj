package com.movieApp.movieApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieApp.movieApp.DAO.RoleRepository;
import com.movieApp.movieApp.entities.Role;




@Service
public class RoleService {

    @Autowired
    private RoleRepository roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
