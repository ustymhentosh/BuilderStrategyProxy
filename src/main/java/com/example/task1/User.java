package com.example.task1;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Builder(builderMethodName = "hiddenBuilder")
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

    public static UserBuilder builder(String name) {
        return hiddenBuilder().name(name);
    }
}