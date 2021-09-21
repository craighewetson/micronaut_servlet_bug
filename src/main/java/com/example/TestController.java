package com.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Put;

@Controller("/test")
public class TestController {

    @Put
    public void test(@Body TestCommand testCommand) {
        System.out.println("testCommand.name() "+testCommand.name());
        if(testCommand.ids().isEmpty()) {
            throw new IllegalArgumentException("Test failed");
        }
    }

}
