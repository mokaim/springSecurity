package com.naver.blog;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Main {

    @RequestMapping(value = "/main" , method = RequestMethod.GET)
    public String main(){


        return "main";
    }

}
