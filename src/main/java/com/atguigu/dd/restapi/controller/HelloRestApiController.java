package com.atguigu.dd.restapi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestApiController {
    
    @RequestMapping("/hello")
    public Map<String, Object> hello(String u,String p){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", "张三");
        System.out.println(u+"==>"+p);
        return map;
    }

}
