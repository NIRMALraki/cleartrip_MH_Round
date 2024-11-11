package com.social.repo;

import com.social.model.User;

import java.util.List;
import java.util.Map;

public class UserRepository {

    private Map<Integer,User> registeredUser;

    public UserRepository(Map<Integer,User> registeredUser) {
        this.registeredUser = registeredUser;
    }


    public User addUser(User user)
    {
        if(user==null)
        {
            return null;
        }
        registeredUser.put(user.getId(), user);
        return user;
    }

    public User getUserById(int id)
    {
        if(registeredUser.containsKey(id))
        {
            return registeredUser.get(id);
        }
        return null;
    }
}
