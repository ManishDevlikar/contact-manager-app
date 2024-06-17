package com.cwm.scm.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PageController {

    @GetMapping("path")
    @ResponseBody
    public String getMethodName(@RequestParam int a) {
        return new String("new page :"+a);
    }

    @GetMapping("path/{a}")
    @ResponseBody
    public String getMethodName2(@PathVariable int a) {
        return new String("new page :" + a);
    }
    
    @GetMapping("index")
    public String getHome(Model model) {
        model.addAttribute("name", "manish");
        model.addAttribute("github", "https://github.com/manishdevlikar");
        return "index";
    }

}
