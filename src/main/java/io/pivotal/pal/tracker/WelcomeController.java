package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class WelcomeController {

    public String message;

    @GetMapping("/")
    public String sayHello() {
        return message;
    }



    public  WelcomeController(@Value("${welcome.message}") String msg)
    {
        message=msg;

    }



}
