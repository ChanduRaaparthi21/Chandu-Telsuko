package com.chandu.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.Repo_OR_Dao.UserRepo;
import com.chandu.model.User;

@Service
public class UserService {

	
	@Autowired
	private UserRepo userRepo;
	
	public User saveUSer(User user) {
		return userRepo.save(user);
	}
	
}
