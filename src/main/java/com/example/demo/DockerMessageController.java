package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class DockerMessageController {
        @GetMapping ("/")
        public String getMessage() {
            return "Hello from Docker!";
        }

}
