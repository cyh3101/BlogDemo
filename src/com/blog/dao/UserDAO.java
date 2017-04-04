package com.blog.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.blog.entity.User;

public class UserDAO extends HibernateDaoSupport{
	public boolean addUser(User user){
		this.getHibernateTemplate().save(user);
		return true;
	}
	
	public void deleteUser(Integer id){
		User user = this.findUserById(id);
		this.getHibernateTemplate().delete(user);
	}
	
	public User findUserById(Integer id){
		return this.getHibernateTemplate().get(User.class, id);
	}
	
	public User updateUser(User user){
		this.getHibernateTemplate().update(user);
		return user;
	}
	
	public List<User> findUsers(String hql){
		
		return (List<User>)this.getHibernateTemplate().find(hql);
	}
}
