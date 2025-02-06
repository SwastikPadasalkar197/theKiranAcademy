package com.tka.Spring_Demo_APIs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringDemoApIsApplication  {

   
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApIsApplication.class, args);
        System.out.println("System is working fine.");
    }  
}
