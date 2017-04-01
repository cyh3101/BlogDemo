package com.blog.service;

import java.util.List;

import com.blog.entity.Blog;

public interface IBlogService {
	public Blog addBlog(Blog blog);
	public void deleteBlogById(Integer id);
	public Blog findBlogById(Integer id);
	public List<Blog> findBlogs();
	public Blog update(Blog blog);
}
