package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CorsController {

    @GetMapping("/api/cors")
    public String view() {
        return "/cors";
    }

    @GetMapping("/loc/hello")
    public String localhostHello() {
        return "/hello";
    }

    @PostMapping("/menjil/hello")
    public String menjilHello() {
        return "/menjil-hello";
    }

    @GetMapping("/oauth2/hello")
    public String localoauth2Hello() {
        return "/oauth-hello";
    }

}
