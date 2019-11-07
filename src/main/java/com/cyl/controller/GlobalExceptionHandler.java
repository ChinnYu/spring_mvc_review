package com.cyl.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author : Liu
 * @Date : 2019/11/7 下午 05:17
 * @Description : 全局異常
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public String handleException(Exception e){
        System.out.println("發生異常");
        return "error";
    }
}
