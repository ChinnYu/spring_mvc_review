package com.cyl.controller;

import com.cyl.entity.Card;
import com.cyl.entity.User;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Liu
 * @Date : 2019/11/6 上午 11:32
 * @Description : 講解如何獲取客戶端傳遞的各種參數
 */

@Controller
@RequestMapping("param")
public class ParamController {

    @RequestMapping(value="getCommonParam")
    @ResponseBody
    public String getCommonParam(String username, String password) {
        System.out.println("username:" + username);
        return "hello," + username;
    }

    @RequestMapping("getObjectParam")
    @ResponseBody
    public String getObjectParam(User user) {
        System.out.println("username:" + user.getUsername());
        System.out.println(user.getCard().getCardNo());
        return "hello," + user.getUsername();
    }

    @RequestMapping("getDiffNameParam")
    @ResponseBody
    public String getDiffNameParam(@RequestParam("username") String user_name) {
        System.out.println("username:" + user_name);
        System.out.println("username:");
        return "hello," + user_name;
    }

    @RequestMapping("getJSONParam")
    @ResponseBody
    public String getJSONParam(@RequestBody User user) {
        System.out.println("username:" + user.getUsername());
        System.out.println(user.getCard().getCardNo());
        return "hello," + user.getUsername();
    }
    @RequestMapping("getById")
    @ResponseBody
    public User getById(String id){
        System.out.println(id);
        User user = new User();
        user.setUsername("美好");
        user.setPassword("2322");
        Card card = new Card();
        card.setCardNo("123");
        user.setCard(card);
        return user;
    }

    @RequestMapping("list")
    @ResponseBody
    public List<User> list(){
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setUsername("美好1");
        user.setPassword("2322");
        Card card = new Card();
        card.setCardNo("123");
        user.setCard(card);
        list.add(user);
        return list;
    }

    @RequestMapping("ajax")
    public String ajax(){
        return "ajax";
    }
}
