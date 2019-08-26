package ru.restaurantvote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.restaurantvote.model.Restaurant;
import ru.restaurantvote.repository.RestaurantRepository;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getAll() {
        return restaurantRepository.getAll();
    }
}
