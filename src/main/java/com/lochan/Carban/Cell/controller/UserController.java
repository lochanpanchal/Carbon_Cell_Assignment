package com.lochan.Carban.Cell.controller;

import com.lochan.Carban.Cell.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/first")
    public String firstProgram(){
        return userService.firstProgram();
    }
}
