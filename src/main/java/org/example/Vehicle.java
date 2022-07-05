package org.example;

public class Vehicle {
    private String type;
    private int size;


    public Vehicle(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
