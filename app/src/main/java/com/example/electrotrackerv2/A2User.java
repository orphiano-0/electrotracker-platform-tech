package com.example.electrotrackerv2;

public class A2User {

    String userName, fullName, email, password;

    public A2User() {

    }

    public A2User(String firstName, String lastName, String age, String userName) {
        this.userName = firstName;
        this.fullName = lastName;
        this.email = age;
        this.password = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
