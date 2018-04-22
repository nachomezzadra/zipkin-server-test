package com.github.nachomezzadra.zipkinservertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerTestApplication.class, args);
    }
}
