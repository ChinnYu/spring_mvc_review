package com.cyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : Liu
 * @Date : 2019/11/6 上午 09:03
 * @Description :
 */

@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    //會將返回的字符串原封不動返回給客戶端
    public String hello(){
        System.out.println("hello");
        //返回邏輯視圖
        return "hello,spring";
    }

    @RequestMapping("view")
    //當沒用@ResponseBody這個註解時,把返回的結果當作一個邏輯視圖來看
    //這個邏輯視圖會通過"試圖解析器"得到真正的視圖,比如**.jsp
    public String view(){
        System.out.println("view");
        //返回邏輯視圖
        return "view";
    }
}
