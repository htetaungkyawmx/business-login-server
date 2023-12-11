package com.example.businessloginserver.controller;


import com.example.businessloginserver.entities.Otp;
import com.example.businessloginserver.entities.User;
import com.example.businessloginserver.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UserService userService;
    //curl -XPOST -H "content-type: application/json" -d "{\"username\":\"john\",\"password\":\"12345\"}" http://localhost:8080/user/add
    @PostMapping("/user/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    //curl -XPOST -H "content-type: application/json" -d "{\"username\":\"john\",\"password\":\"12345\"}" http://localhost:8080/user/auth
    @PostMapping("/user/auth")
    public void auth(@RequestBody User user){
        userService.auth(user);
    }
    //curl -v -XPOST -H "content-type: application/json" -d "{\"username\":\"john\",\"code\":\"4319\"}" http://localhost:8080/otp/check
    @PostMapping("/otp/check")
    public void check(@RequestBody Otp otp, HttpServletResponse response){
        if(userService.check(otp)){
            response.setStatus(HttpServletResponse.SC_OK);
        }
        else{
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        }
    }
}
