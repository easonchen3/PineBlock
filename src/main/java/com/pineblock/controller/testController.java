package com.pineblock.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-05-16 17:13
 * @Version 1.0
 */
@RestController
public class testController {


    @GetMapping("home")
    public ResponseEntity<Map> goHome(){
        Map<String , Object> paramMap = new HashMap<>();
        paramMap.put("name","zhangshan");
        paramMap.put("age",35);
        return ResponseEntity.ok(paramMap);
    }
}
