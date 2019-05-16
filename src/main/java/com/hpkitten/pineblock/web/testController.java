package com.hpkitten.pineblock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Author: BaoJian.Xu
 * @Date: 2019-05-16 17:13
 * @Version 1.0
 */
@Controller
public class testController {


    @RequestMapping("home")
    public String goHome(Map<String , Object> paramMap){
        paramMap.put("name","zhangshan");
        paramMap.put("age",35);
        return "/home";
    }
}
