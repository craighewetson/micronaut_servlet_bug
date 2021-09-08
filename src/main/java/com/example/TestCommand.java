package com.example;

import io.micronaut.core.annotation.Introspected;

import java.util.List;

@Introspected
public record TestCommand(String name,
                          List<Long> ids) {
}
