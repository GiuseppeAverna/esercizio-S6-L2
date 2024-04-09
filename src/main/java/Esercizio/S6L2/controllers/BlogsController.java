package Esercizio.S6L2.controllers;

import Esercizio.S6L2.entities.Blog;
import Esercizio.S6L2.services.BlogsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogsController {
    @Autowired
    private BlogsServices blogsService;
    @GetMapping
    private List<Blog> getallBlogs(){
        return this.blogsService.getBlogsList();
    }
    @PostMapping
    private Blog saveBlog(@RequestBody Blog body){
        return this.blogsService.saveBlog(body);
    }
//    @GetMapping
//    private Blog findBlogById(@PathVariable int blogId){}
//    @PutMapping
//    private Blog findBlogByIdAndUpdate (@PathVariable int blogId, @RequestBody Blog blog) {}
//    @DeleteMapping
//    private Blog findBlogByIdAndDelete (@PathVariable int blogI) {}
}
