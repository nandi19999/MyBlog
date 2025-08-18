package com.Bolg.myBlog.Controller;

import com.Bolg.myBlog.entity.Blog;
import com.Bolg.myBlog.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ViewController {
    @Autowired
    BlogRepo blogRepo;
    @GetMapping("/post")
    public String postBlog() {
        System.out.println("postBlog");
        return "post";
    }
    @GetMapping("/")
    public String index() {
        System.out.println("index");
        return "index";
    }
    @GetMapping("/view")
    public String getAllBlogs(Model model) {
        List<Blog> blogs = blogRepo.findAll();
        model.addAttribute("blogs", blogs);
        return "blogs";
    }
}
