package com.cyl.controller;

import com.cyl.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : Liu
 * @Date : 2019/11/7 下午 07:58
 * @Description :
 */
@Component
@RequestMapping("user")
public class UserController {

    @RequestMapping("getById")
    @ResponseBody
    public User getById(Integer id){
        System.out.println(id);
        User user = new User();
        user.setUsername("gg");
        user.setPassword("66666");
        return user;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getById2(@PathVariable("id") Integer id){
        System.out.println(id);
        User user = new User();
        user.setUsername("glg");
        user.setPassword("66666");
        return user;
    }

    @RequestMapping("delById")
    @ResponseBody
    public User delById(Integer id){
        System.out.println(id);
        User user = new User();
        user.setUsername("gg");
        user.setPassword("66666");
        return user;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public User delById2(@PathVariable("id") Integer id){
        System.out.println("DEL"+id);
        User user = new User();
        user.setUsername("glg");
        user.setPassword("66666");
        return user;
    }

    @RequestMapping(value = "saveOrUpdate", method = RequestMethod.POST)
    @ResponseBody
    public User add(User user){
        System.out.println(user.getUsername());
        return user;
    }

    @RequestMapping(value = "saveOrUpdate", method = RequestMethod.PUT)
    @ResponseBody
    public User add2(User user){
        System.out.println(user.getId());
        return user;
    }
}
