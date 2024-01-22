package org.application;

import java.util.List;
import java.util.Map;

public interface CarRental {

    Map<String, Integer> getAllCars();

    void addCar(String carName, Integer price);

    List<String> sortByPrice();

    List<String> getCarNamesWithPriceLowerThan(Integer number);

    Integer countTotalPriceForCar(String name, int amountOfDays);
}
