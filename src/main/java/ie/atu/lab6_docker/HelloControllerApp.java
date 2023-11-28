package ie.atu.lab6_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerApp {
    @GetMapping("/hello")
    public String hello(){return "Hello!!";}
}
