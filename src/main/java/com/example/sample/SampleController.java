package com.example.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class SampleController {

//    @CrossOrigin(origins = "*")
//    https://reflectoring.io/spring-cors/
//    @CrossOrigin(exposedHeaders = {"Access-Control-Allow-Origin"})
    @CrossOrigin
    @GetMapping("/greeting")
    public List<Greeting> greeting() {
        log.info("greeting");
        return List.of(new Greeting("1", "banulp1")
                ,new Greeting("2", "banulp2")
                ,new Greeting("3", "banulp3"));
    }

}
