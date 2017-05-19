package com.github.walak.knight.server;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KnightController {

    @RequestMapping("status")
    public String status() {
        return "OK!";
    }
}
