package org.growUpToMiddle.dao;

import org.growUpToMiddle.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class UserDaoImpl implements UserDao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
    }

    @Override
    public void saveUser(User user) {
    }

    @Override
    public User getUserById(Long id) {
    }

    @Override
    public void addUser(User user) {
    }

    @Override
    public void deleteUser(Long id) {
    }


}
