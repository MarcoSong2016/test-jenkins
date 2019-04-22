package com.example.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marco Song
 * @since 1.0.0
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test (){
        return "YES!";
    }
}
