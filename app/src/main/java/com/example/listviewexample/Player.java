package com.example.listviewexample;

import android.widget.ImageView;

public class Player {
    String name;
    int age;
    double worth;
    String main_sport;
    ImageView picture;
    //Todo finish the class player
        // Todo 5 member variables
        //Todo name, age, worth(money), main sport and int image resource from drawable

    public ImageView getPicture() {
        return picture;
    }

    public void setPicture(ImageView picture) {
        this.picture = picture;
    }

    public Player(String name, int age, double worth, String main_sport, ImageView picture) {
        this.name = name;
        this.age = age;
        this.worth = worth;
        this.main_sport=main_sport;
        this.picture=picture;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    public void setMain_sport(String main_sport) {
        this.main_sport = main_sport;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public double getWorth() {

        return worth;
    }

    public String getMain_sport() {
        return main_sport;
    }


//Todo create constructor and getters and setters
        // use Android Studio for fast writing code, find Code->Generate
}
