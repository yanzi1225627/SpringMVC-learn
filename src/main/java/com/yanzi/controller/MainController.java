package com.yanzi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
