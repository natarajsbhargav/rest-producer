package com.bhargav.hystrix.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{username}")
    public String getWelcomeMessage(@PathVariable("username") String userName) {
        try {
            Thread.sleep(4000);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        StringBuilder stringBuilder = new StringBuilder()
                .append("Welcome ").append(userName).append(" !\n");
        return stringBuilder.toString();
    }

}
