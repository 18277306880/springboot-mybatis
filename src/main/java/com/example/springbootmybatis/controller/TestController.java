package com.example.springbootmybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public  String test(){
        return  "测试自动化部署收工,简直完美perfict";
    }
}
