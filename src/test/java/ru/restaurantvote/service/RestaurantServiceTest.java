package ru.restaurantvote.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.restaurantvote.RestaurantTestData;

import static ru.restaurantvote.RestaurantTestData.*;

class RestaurantServiceTest extends AbstractServiceTest {

    @Autowired
    private RestaurantService service;

    @Test
    void getAll() {
        assertMatch(service.getAll(), RESTAURANTS);
    }
}