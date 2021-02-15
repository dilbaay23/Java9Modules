package com.hello.client;

import com.hello.HelloWorld;

/**
 * Created By Moon
 * 2/15/2021, Mon
 **/
public class HelloWorldClient {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        final String sayHelloWorld = helloWorld.sayHelloWorld();
        System.out.println(sayHelloWorld);
    }
}
