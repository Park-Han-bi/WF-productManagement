package com.example.springsecurity.service;

import com.example.springsecurity.entity.MyRole;
import com.example.springsecurity.entity.MyUser;

import java.util.List;

public interface RegistrationService {
    MyUser createUser(MyUser user, List<MyRole> userRoles);

    boolean checkEmailExists(String email);

    MyRole findByRolename(String rolename);
}
