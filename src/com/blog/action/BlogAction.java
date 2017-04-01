package com.blog.action;

import com.blog.entity.Blog;
import com.blog.service.IBlogService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BlogAction extends ActionSupport implements ModelDriven<Blog>{
	
	private IBlogService blogService;
	private Blog blog;
	
	public IBlogService getBlogService() {
		return blogService;
	}

	public void setBlogService(IBlogService blogService) {
		this.blogService = blogService;
	}
	
	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	
	@Override
	public Blog getModel() {
		// TODO Auto-generated method stub
		return this.blog;
	}

	public String addBlog(){
		System.out.println("blogAction print");
		this.blogService.addBlog(blog);
		return NONE;
	}

}
