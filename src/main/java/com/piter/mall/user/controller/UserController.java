package com.piter.mall.user.controller;

import com.piter.mall.user.po.User;
import com.piter.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public void addUser(@RequestParam String name, @RequestParam Integer age){
        User user = new User();
        user.setAge(age);
        user.setName(name);

        userService.addUser(user);

    }
}
