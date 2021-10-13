package com.psttrmtc.customListview;

public class User {
    int image;
    String name, number;

    public User(int image, String name, String number) {
        this.image = image;
        this.name = name;
        this.number = number;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
