package com.Team10.mpsdassignment;

public class User {
    public String firstName, lastName, email, gender, bType;
    public int age;

    public User() {
    }

    public User (String firstName, String lastName, String email, int age, String gender, String bType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.bType = bType;
    }
}
