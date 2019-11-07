package com.cyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : Liu
 * @Date : 2019/11/7 下午 12:45
 * @Description :
 */
@Controller
public class UploadController {

    @RequestMapping("upload")
    @ResponseBody
    public String upload(MultipartFile file,String desc){
        System.out.println(file.getOriginalFilename());
        return "ok";
    }

    @RequestMapping("multiupload")
    @ResponseBody
    public String upload(MultipartFile[] file){
       for (MultipartFile multipartFile : file){
           System.out.println(multipartFile.getOriginalFilename());
       }
        return "ok";
    }
}
