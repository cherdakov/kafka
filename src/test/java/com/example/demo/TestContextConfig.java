package com.example.demo;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;

@TestConfiguration
@TestPropertySource(locations = {"classpath:application.properties", "classpath:test-application.properties"})
public class TestContextConfig {
}
