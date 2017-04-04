package com.blog.service;

import java.util.List;

import com.blog.dao.UserDAO;
import com.blog.entity.User;

public class UserService implements IUserService{

	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean addUser(User user) {
		this.userDAO.addUser(user);
		return true;
	}

	@Override
	public void deleteUser(Integer id) {
		this.userDAO.deleteUser(id);
		
	}

	@Override
	public User findUserById(Integer id) {
		return this.userDAO.findUserById(id);
	}

	@Override
	public User updateUser(User user) {
		this.userDAO.updateUser(user);
		return user;
	}

	@Override
	public List<User> findUsers(String hql) {
		return this.userDAO.findUsers(hql);
	}

}
