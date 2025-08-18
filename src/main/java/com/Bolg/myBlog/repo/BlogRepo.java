package com.Bolg.myBlog.repo;

import com.Bolg.myBlog.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog, Integer> {

}