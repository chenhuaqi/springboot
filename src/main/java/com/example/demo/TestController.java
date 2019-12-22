package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String add(@RequestParam("account") String account,
                      @RequestParam("pwd") String pwd){
        return "testController";
    }
    @PostMapping("/test2")
    public String add2(){
        return "test2Controller";
    }

}
