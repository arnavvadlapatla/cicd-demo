package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String VERSION = "Version 2 - Deployed Automatically!";

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return "<html><body style='font-family:sans-serif;text-align:center;margin-top:80px'>"
             + "<h1>Hello from the CI/CD Pipeline!</h1>"
             + "<h2>" + VERSION + "</h2>"
             + "<p>Built with Maven, packaged with Docker, deployed on AKS.</p>"
             + "</body></html>";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
