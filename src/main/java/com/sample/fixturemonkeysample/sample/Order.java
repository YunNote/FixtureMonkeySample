package com.sample.fixturemonkeysample.sample;

import lombok.Getter;
import lombok.NonNull;
import lombok.Value;

class Order {

    @NonNull
     String name;

     int age;

    public Order() {

        System.out.println("돈다돌아");
    }
}
