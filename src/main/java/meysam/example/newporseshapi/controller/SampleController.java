package meysam.example.newporseshapi.controller;

//import org.springframework.stereotype.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    @GetMapping(path = "api/sayHello")
    public String sayHello()
    {
        return "Hello World!";
    }

}
