package ru.restaurantvote;

import ru.restaurantvote.model.Restaurant;

import java.util.Arrays;
import java.util.List;

public class RestaurantsTestData {
    public static final Restaurant RESTAURANT1 = new Restaurant(100001, "Perchini", 0);
    public static final Restaurant RESTAURANT2 = new Restaurant(100002, "USSR", 0);
    public static final Restaurant RESTAURANT3 = new Restaurant(100003, "KFC", 0);

    public static final List<Restaurant> RESTAURANTS = Arrays.asList(RESTAURANT1, RESTAURANT2, RESTAURANT3);
}
