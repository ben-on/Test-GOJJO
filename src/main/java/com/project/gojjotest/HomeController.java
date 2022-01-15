package com.project.gojjotest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/home")
    public String Home(){
        return "home";
    }

    @GetMapping("/indexTwo")
    public String indexTwo(){
        return "indexTwo";
    }
}
