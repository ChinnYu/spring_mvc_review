package com.cyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : Liu
 * @Date : 2019/11/7 下午 02:43
 * @Description :
 */
@Controller
@RequestMapping("my")
public class MyController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello");
    return "ok";
    }

    @RequestMapping("hello/sub")
    @ResponseBody
    public String helloSub(){
        System.out.println("helloSub");
        return "ok";
    }
}
