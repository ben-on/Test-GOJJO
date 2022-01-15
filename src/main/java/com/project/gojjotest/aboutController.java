package com.project.gojjotest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aboutController {
    @GetMapping("/aboutUs")
    public String about(){
        return "aboutUs" ;
    }
    @RequestMapping("/aboutUs")
    public String Rabout(){
        return "aboutUs" ;
    }
}
