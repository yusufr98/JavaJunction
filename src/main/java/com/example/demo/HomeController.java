package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    PostRepository postRepository;

    @RequestMapping("/")
    public String listPosts(Model model){
        model.addAttribute("posts", postRepository.findAll());
        return "index";
    }

    @RequestMapping("/about")
    public String aboutMe(){
        return "about";
    }
    @RequestMapping("/git")
    public String inherit(){
        return "git";
    }
    @RequestMapping("/comp")
    public String acomp(){
        return "comp";
    }


}
