package com.dawnrecord.controller;

import com.dawnrecord.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * @author Li-Xiaoxu
 * @version 1.0
 * @date 2020/4/24 17:57
 */
@Controller
@RequestMapping(value = "/helloController")
public class HelloController {

    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("hello world!");
//        return "success";
        return "success";
    }

    @RequestMapping(path="/saveUser")
    public String saveUser(User user){
        System.out.println("执行saveUser");
        System.out.println(user);
//        return "success";
        return "success";
    }

    @RequestMapping(path="/annoTest")
    public String annoTest(@RequestParam(name="name") String s){
        System.out.println("执行annoTest s = " + s);
//        return "success";
        return "success";
    }

    @RequestMapping(path="/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println("testModelAttribute ");
        System.out.println(user);
//        return "success";
        return "success";
    }

    @ModelAttribute
    public User showUser(String name){
        System.out.println("showUser执行了...");
        // 通过用户查询数据库（模拟）
        User user = new User();
        user.setName(name);
        user.setAge(111);
        user.setBirthday(new Date());
        return user;

    }
}
