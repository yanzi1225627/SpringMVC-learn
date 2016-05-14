package com.yanzi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yanzi on 16/5/14.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printHello(Model model){

        model.addAttribute("title", "helloworld");
        model.addAttribute("content", "welcom to you!");
        return "index";
    }

    @RequestMapping(value="/page/{name}/{age}", method = RequestMethod.GET)
    public String getName(Model model, @PathVariable("name") String name, @PathVariable("age") int age){
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "name";
    }

    @RequestMapping(value="/result", method = RequestMethod.GET)
    public String result(Model model, @RequestParam String name, @RequestParam int age){
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "result";
    }
}
