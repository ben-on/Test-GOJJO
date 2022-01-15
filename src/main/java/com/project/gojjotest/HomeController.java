package com.project.gojjotest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/home")
    public String Home(){
        return "home";
    }

    @GetMapping("/index")
    public String indexTwo(){
        return "indexTwo";
    }

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }
    @GetMapping("/about")
    public String about(){
        return "aboutUs";
    }
}
