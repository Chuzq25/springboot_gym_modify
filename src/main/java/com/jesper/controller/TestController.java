package com.jesper.controller;

import com.jesper.model.Delivery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {

    @RequestMapping("test/demo_{name}")
    public String showDemo(@PathVariable String name){
        return "demo/"+name;
    }
}
