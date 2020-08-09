package com.example.redissession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author yinda
 * @create 2020/8/8 23:10
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public String loginHandler(HttpServletRequest request){
        return  request.getSession().toString();

    }
}
