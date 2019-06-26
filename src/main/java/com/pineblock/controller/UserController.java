package com.pineblock.controller;

import com.pineblock.common.ResponseCode;
import com.pineblock.entity.User;
import com.pineblock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-06-26 20:15
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findById")
    public ResponseCode findById(@RequestParam("id")Long id){
        User user = userService.findById(id);
        if(user == null){
            return ResponseCode.error();
        }else{
            return ResponseCode.success(user);
        }
    }

    @PostMapping("login")
    public ResponseCode login(User user) throws Exception {
        User newUser = userService.findByName(user.getUsername());
        if(newUser.getPassword().equals(user.getPassword())){
            return ResponseCode.success(user);
        }else{
            throw new Exception("cuowu");
        }
    }
    
    public static void main(String[] args){
       
    }

}
