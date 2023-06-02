package com.exam.services;

import java.util.Set;

import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.exam.models.User;
import com.exam.models.UserRole;
@Repository
public interface UserService {
//Create user
	public User createUser(User user,Set<UserRole>userRoles) throws Exception;
}
