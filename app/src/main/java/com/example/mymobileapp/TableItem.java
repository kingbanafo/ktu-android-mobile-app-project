package com.example.mymobileapp;

public class TableItem {
    private String name;
    private String location;
    private double price;
    private int ratings;
    private int imageResId;

    // Constructor
    public TableItem(String name, String location, double price, int ratings, int imageResId) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.ratings = ratings;
        this.imageResId = imageResId;
    }

    // Getter methods
    public String getName() { return name; }
    public String getLocation() { return location; }
    public double getPrice() { return price; }
    public int getRatings() { return ratings; }
    public int getImageResId() { return imageResId; }
}