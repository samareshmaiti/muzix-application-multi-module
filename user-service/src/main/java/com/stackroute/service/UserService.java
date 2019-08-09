package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exceptions.UserAlreadyExistsException;
import com.stackroute.exceptions.UserIdNotFoundException;


import java.util.List;

public interface UserService {

    public User saveUser(User user) throws UserAlreadyExistsException;
    public User getUserById(int id) throws UserIdNotFoundException;

    public List<User> getAllUsers();
}
