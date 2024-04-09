package Esercizio.S6L2.services;

import Esercizio.S6L2.entities.Blog;
import Esercizio.S6L2.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class BlogsServices {
    private List<Blog> blogsList = new ArrayList<>();
    public List<Blog> getBlogsList(){
        return this.blogsList;
    }
    public Blog saveBlog (Blog body){
        Random rndm = new Random();
        body.setId(rndm.nextInt(1,1000));
        this.blogsList.add(body);
        return body;
    }
    public Blog findById(int id) {
        Blog found = null;
        for (Blog blog: this.blogsList) {
            if(blog.getId() == id) found = blog;
        }
        if (found == null) throw new NotFoundException(id);
        else return found;

    }



}
