package org.k8sdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sDemoApplication {
    //    We have a simple REST controller that returns a welcome message when the root URL is accessed.
    @GetMapping
    public String welcomeMessage() {
        return "Welcome to the world of Kubernetes !!";
    }

    public static void main(String[] args) {
        SpringApplication.run(K8sDemoApplication.class, args);
    }

}
