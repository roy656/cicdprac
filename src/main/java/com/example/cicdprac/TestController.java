package com.example.cicdprac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/check")
    public String checkTest() {
        return "OK!!!!!";
    }

    @PostMapping("/api/postcheck")
    public void post(RequestDto requestDto) {

    }
}
