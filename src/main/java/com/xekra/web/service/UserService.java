package com.xekra.web.service;

import com.xekra.web.model.User;
import java.util.List;

public interface UserService {

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> getAllUsers();
}
