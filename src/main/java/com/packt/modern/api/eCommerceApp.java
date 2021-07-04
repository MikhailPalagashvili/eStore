package com.packt.modern.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class eCommerceApp {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(eCommerceApp.class, args);

        System.out.println("# Beans " + ctx.getBeanDefinitionCount());

        var names = ctx.getBeanDefinitionNames();
        Arrays.sort(names);
        Arrays.asList(names).forEach(System.out::println);
    }
}