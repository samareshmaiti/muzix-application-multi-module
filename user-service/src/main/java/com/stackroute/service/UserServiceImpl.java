package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exceptions.UserAlreadyExistsException;
import com.stackroute.exceptions.UserIdNotFoundException;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

   private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository1)
    {
        this.userRepository = userRepository1;
    }


    @Override
    public User saveUser(User user) throws UserAlreadyExistsException {
        if(userRepository.existsById(user.getId()))
        {
            throw new UserAlreadyExistsException("User already exists");
        }
        User saveUser1= userRepository.save(user);
        if(saveUser1==null)
        {
            throw new UserAlreadyExistsException("no connection to database");
        }
        return saveUser1;
    }

    @Override
    public User getUserById(int  id) throws UserIdNotFoundException {
        if(userRepository.existsById(id))
        {
            throw new UserIdNotFoundException("User not exists");
        }
      User retrivedUser= userRepository.findById(id).get();
        if(retrivedUser==null)
        {
            throw new UserIdNotFoundException("no connection to database");
        }
      return retrivedUser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
