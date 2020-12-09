package com.inspur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author MiaoChuanXin
 */
@Controller
public class IndexController {
    @GetMapping({"/", "index"})
    public String index() {
        return "index";
    }
}
