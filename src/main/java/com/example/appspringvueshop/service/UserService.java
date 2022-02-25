package com.example.appspringvueshop.service;

import com.example.appspringvueshop.model.Role;
import com.example.appspringvueshop.model.User;

import java.util.Optional;

public interface UserService {
	User saveUser(User user);

	Optional<User> findByUsername(String username);

	void changeRole(Role newRole, String username);
}
