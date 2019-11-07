package com.cyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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
        //故意製造一個異常
        int i = 1/0;
        return "ok";
    }

    //加上異常處理
//    @ExceptionHandler
//    public String handleException(Exception e){
//        System.out.println("error");
//        return "error";
//    }

    @RequestMapping("hello/sub")
    @ResponseBody
    public String helloSub(){
        System.out.println("helloSub");
        return "ok";
    }

    @RequestMapping("forwardByMVC")
    public String forwardByMVC(HttpServletRequest request){
        request.setAttribute("msg","ok");
        System.out.println("forwardByMVC");
        return "forward";
    }

    @RequestMapping("forwardByMVC2")
    public String forwardByMVC2(Model model){
        model.addAttribute("msg","ok");
        System.out.println("forwardByMVC");
        return "forward";
    }

}
