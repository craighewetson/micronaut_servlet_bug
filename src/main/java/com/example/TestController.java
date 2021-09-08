package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Put;

@Controller("/test")
public class TestController {

    @Put
    public void createProject(TestCommand testCommand) {
        System.out.println("testCommand.name() "+testCommand.name());
        if(testCommand.ids().isEmpty()) {
            throw new IllegalArgumentException("Test failed");
        }
    }

}
