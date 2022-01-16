package com.project.gojjotest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class createPostController {
    @GetMapping("/createPost")
    public String create(){
        return "createPost" ;
    }
    @RequestMapping("/createPost")
    public String Rcreate(){
        return "createPost" ;
    }
}
