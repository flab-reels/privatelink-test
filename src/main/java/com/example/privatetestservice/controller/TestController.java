package com.example.privatetestservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @GetMapping("/privatelink")
    public String responseCheck(HttpServletRequest request){
        return "Private Link Active " + request.getParameter("privatelink");
    }
}
