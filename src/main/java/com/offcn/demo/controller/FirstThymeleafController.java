package com.offcn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstThymeleafController {
    @GetMapping("/first")
    public String indexPage(Model model) {
        String message = "分支测试最终";
        model.addAttribute("message", message);
        return "index";
    }
}
