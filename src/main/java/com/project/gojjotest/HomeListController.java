package com.project.gojjotest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeListController {
    @GetMapping("/homelist")
    public String homelist(){
        return "homelist";
    }
    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }
    
}
