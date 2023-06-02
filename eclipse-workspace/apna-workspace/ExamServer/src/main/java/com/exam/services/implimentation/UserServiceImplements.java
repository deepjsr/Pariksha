package com.exam.services.implimentation;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.models.User;
import com.exam.models.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.services.UserService;

@Service
public class UserServiceImplements implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;

//creating User
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User local = this.userRepository.findByUserName(user.getUsername());

		if (local != null) {
			System.out.println("User is already there!!");
			throw new Exception("User is already present...!!");

		} else {
			// user created
			for (UserRole userRole : userRoles) {
				roleRepository.save(userRole.getRole());
			}
			user.getsUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
		}
		return local;
	}

}
