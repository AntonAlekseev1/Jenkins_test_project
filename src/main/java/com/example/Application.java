package com.example;

import com.example.service.Service;

public class Application {

    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.getSelfName());
    }
}
