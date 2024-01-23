package org.application;

import java.util.HashMap;
import java.util.Map;

/*
Imagine you're writing simple API for car rental company.
You were asked by business to write implementation of interface, which should handle some common
operations on available car's data.

Tasks:
1) Create class implementing CarRental interface containing Map data structure to store available car's data
   (name <String> and price <Integer> per day).
2) Implement getAllCars method returning all available cars.
2) Implement addCar method to add new car to available car's pool.
3) Implement sortByPrice method which should return all car's names sorted from lowest to highest price.
4) Implement function getCarNamesWithPriceLowerThan, filtering available car's and returning only car name's
   with price per day lower or equal to given amount.
5) Implement countTotalPriceForCar function, taking car name and amount of day's as parameters and
   returning full price of given car for given amount of days.
 */
public class Main {
    private static final Map<String, Integer> ALL_CARS = new HashMap<>();

    static {
        ALL_CARS.put("Honda", 100);
        ALL_CARS.put("BMW", 350);
        ALL_CARS.put("Audi", 300);
        ALL_CARS.put("Renault", 120);
        ALL_CARS.put("Mercedes", 500);
    }

    public static void main(String[] args) {
        System.out.println("Hello from HSBC Car Rental Company!");
    }

}