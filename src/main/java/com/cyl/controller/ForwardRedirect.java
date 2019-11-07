package com.cyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : Liu
 * @Date : 2019/11/7 上午 10:45
 * @Description :
 */
@Controller
@RequestMapping("forward")
public class ForwardRedirect {

    //原生方式
    @RequestMapping("forwardByServletAPI")
    public void forward(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("forward.jsp").forward(request,response);
    }

    //原生方式
    @RequestMapping("redirectByServletAPI")
    public String redirectByServletAPI() {
        return "forward";
    }

    //springMVC提供的方式
    //默認的方式就是轉發
    @RequestMapping("forwardByMVC")
    public void forwardByMVC(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("forward.jsp").forward(request,response);
    }

    @RequestMapping("redirectByMVC")
    public String redirectByMVC() {
        return "redirect:list";
    }

    @RequestMapping("list")
    public String list() {
        System.out.println("list....");
        return "list";
    }

}
