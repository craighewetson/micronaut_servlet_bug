package com.example;

import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.util.ArrayList;
import java.util.List;

@MicronautTest
@TestInstance(Lifecycle.PER_CLASS)
public class TestControllerTest {

    @Test
    void test(HttpClient client) {
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        client.test(new TestCommand("testing...", ids));
    }

    @Client("/")
    interface HttpClient {

        @Put("test")
        void test(@Body TestCommand testCommand);
    }

}
