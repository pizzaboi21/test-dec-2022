package com.example.demo.helllo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class helloController {

private final helloService helloService;

    @Autowired
    public helloController(helloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/")
//    String return1() {
//        return "Hello World!";
//    }
    public List<testTable> hello()
    {
        return helloService.hello();
    }
}
