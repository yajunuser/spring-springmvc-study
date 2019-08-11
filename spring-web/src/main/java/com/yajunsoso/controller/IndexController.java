package com.yajunsoso.controller;

import com.javasoso.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Autowired
    private MyService myService;
    @RequestMapping("/")
    public String sayHello(){
        return "/WEB-INF/index.jsp";
    }
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        return myService.save();
    }
}

