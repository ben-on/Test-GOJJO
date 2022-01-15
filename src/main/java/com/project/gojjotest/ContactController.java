package com.project.gojjotest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
   @GetMapping("/contact")
   public String contact() {
       return "contact";
   }
   @RequestMapping("/contact")
       public String Rcontact(){
           return "contact" ;
       }
   }
