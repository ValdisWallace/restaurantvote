package ru.restaurantvote.web.restaurant;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.restaurantvote.model.Restaurant;
import ru.restaurantvote.repository.RestaurantRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/restaurants", produces = MediaType.APPLICATION_JSON_VALUE)
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @GetMapping
    public List<Restaurant> getAll() {
        List<Restaurant> restaurants =  restaurantRepository.findAll();
        return restaurants;
    }
}
