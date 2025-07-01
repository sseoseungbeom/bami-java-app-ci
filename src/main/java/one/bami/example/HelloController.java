package one.bami.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/test")
    public String hello() {
        return "Hello World0004";
    }

    @GetMapping("/test2")
    public String hello2() {
        return "Hello World2222222222222";
    }
}
