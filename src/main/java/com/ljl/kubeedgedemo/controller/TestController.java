package com.ljl.kubeedgedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jl li
 * @date 2022/7/25 15:46
 * @since 1.0.0
 */
@RestController
public class TestController {

    @Autowired
    private LibXAutoConfiguration libXAutoConfiguration;

    @GetMapping("/test")
    public String test(){
        libXAutoConfiguration.say();
        return "success";
    }
}
