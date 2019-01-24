package com.hyy.invo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hyy.invo.domain.User;
import com.hyy.invo.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;
 
    @RequestMapping("/")
    public List home() throws Exception {
 
       List<User> list =  userService.getUser();
 
       return list;
 
    }
    
    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String add(@RequestBody User user) throws Exception {
    	userService.insert(user);
        return "ok";
    }
}
