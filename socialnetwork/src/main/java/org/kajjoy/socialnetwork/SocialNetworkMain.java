package org.kajjoy.socialnetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialNetworkMain {

    public static void main(String args[]){
        System.out.println("Welcome to the social network app");
        SpringApplication.run(SocialNetworkMain.class,args);
    }
}
