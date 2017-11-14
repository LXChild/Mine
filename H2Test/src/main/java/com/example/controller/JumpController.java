package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Wang Chong
 * @description
 * @date 2017/3/3
 * @modified by
 */
@Controller
public class JumpController {

    @GetMapping("/")
    public String toIndex() {
        return "index";
    }
}
