package com.pineblock.controller;

import com.pineblock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-06-26 20:52
 * @Version 1.0
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String login(){
        return "admin/login";
    }

}
