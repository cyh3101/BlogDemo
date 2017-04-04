package com.blog.service;

import java.util.List;

import com.blog.entity.User;

public interface IUserService {
	public boolean addUser(User user);
	public void deleteUser(Integer id);
	public User findUserById(Integer id);
	public User updateUser(User user);
	public List<User> findUsers(String hql);
}
