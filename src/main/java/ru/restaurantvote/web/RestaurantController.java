package ru.restaurantvote.web;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.restaurantvote.model.Restaurant;
import ru.restaurantvote.service.RestaurantService;

import java.util.List;

@RestController
@RequestMapping(value = RestaurantController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class RestaurantController {
    static final String REST_URL = "/rest/restaurants";

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public List<Restaurant> getAll() {
        return restaurantService.getAll();
    }
}
