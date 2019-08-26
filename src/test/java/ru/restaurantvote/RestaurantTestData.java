package ru.restaurantvote;

import org.assertj.core.api.Assertions;
import ru.restaurantvote.model.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RestaurantTestData {

    public static final int RESTAURANT_ID = 100001;

    public static final Restaurant RESTAURANT1 = new Restaurant(RESTAURANT_ID, "Perchini", 0);
    public static final Restaurant RESTAURANT2 = new Restaurant(RESTAURANT_ID + 1, "USSR", 0);
    public static final Restaurant RESTAURANT3 = new Restaurant(RESTAURANT_ID + 2, "KFC", 0);

    public static final List<Restaurant> RESTAURANTS = Arrays.asList(RESTAURANT1, RESTAURANT2, RESTAURANT3);

    public static void assertMatch(Iterable<Restaurant> actual, Iterable<Restaurant> expected) {
        assertThat(actual).isEqualTo(expected);
    }
}
