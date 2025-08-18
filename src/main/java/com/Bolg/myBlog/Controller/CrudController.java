package com.Bolg.myBlog.Controller;

import com.Bolg.myBlog.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Bolg.myBlog.repo.BlogRepo;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.logging.Logger;

@RestController
public class CrudController {
    @Autowired
    private BlogRepo blogRepo;
    @GetMapping("/get")
    public com.Bolg.myBlog.bean.Blog getBlogs() {
        com.Bolg.myBlog.bean.Blog blog = new com.Bolg.myBlog.bean.Blog(
                "Blog content",
                "title", "author",
                "data",
                "id");
        return blog;
    }
    @PostMapping("/add")
    public ResponseEntity addBlog(@RequestBody Blog blog) {
        blogRepo.save(blog);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
