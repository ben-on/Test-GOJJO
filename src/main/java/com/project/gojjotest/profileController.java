package com.project.gojjotest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class profileController {
    @GetMapping("/profile")
    public String profile(){
        return "profile" ;
    }
    @RequestMapping("/profile")
    public String Rprofile(){
        return "profile" ;
    }
}
