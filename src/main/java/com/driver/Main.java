package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name() = kunal; wont work as private
        obj.setName("Kunal");
        obj.getName();
    }
  
}