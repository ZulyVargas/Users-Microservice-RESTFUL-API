package edu.eci.ieti.tasks.service.impl;


import edu.eci.ieti.tasks.entities.User;
import edu.eci.ieti.tasks.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService {
    HashMap users = new HashMap();

    @Override
    public User create(User user) {
        users.put(user.getId(),user);
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public User update(User user, String userId) {
        return null;
    }
}
