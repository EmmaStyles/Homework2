package com.example.homework2;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String cuisine;
    private String location;
    private double rating;

    public Restaurant(){}

    public Restaurant(String name, String cuisine, String location, double rating){
        this.name = name;
        this.cuisine = cuisine;
        this.location = location;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine() {
        this.cuisine = cuisine;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation() {
        this.location = location;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(){
        this.rating = rating;
    }

    public static ArrayList<Restaurant> getRestaurants() {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("The Char Rotisserie", "Chicken and burgers", "Bondi Road", 4));
        restaurants.add(new Restaurant("Ninety Nine Thai", "Thai", "Bondi Road", 4.7));
        restaurants.add(new Restaurant("Tin Pin Bakery", "Bakery", "Bondi Road", 4.8));
        restaurants.add(new Restaurant("Mojo's Tapas Bar", "Spanish", "Campbell Parade", 4.7));
        restaurants.add(new Restaurant("Bondi Trattoria", "Italian", "Campbell Parade", 4.5));
        restaurants.add(new Restaurant("Society Pizza", "Italian", "Curlewis Street", 4.5));
        restaurants.add(new Restaurant("Milky Lane Bondi", "Burgers", "Curlewis Street", 3.7));
        restaurants.add(new Restaurant("Sonoma Cafe", "Cafe", "Gould Street", 4));
        restaurants.add(new Restaurant("Gelato Messina", "Icecream", "Hall Street", 4));
        restaurants.add(new Restaurant("Johnny Gio's", "Italian", "Bondi Road", 4.8));
        return restaurants;
    }
}
