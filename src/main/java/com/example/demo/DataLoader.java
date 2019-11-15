package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    PostRepository postRepository;

    @Override
    public void run(String... strings) throws Exception{
        Post post;
        post = new Post("Welcome to my java blog", "11/15/19", "welcome");
        postRepository.save(post);
    }
}
