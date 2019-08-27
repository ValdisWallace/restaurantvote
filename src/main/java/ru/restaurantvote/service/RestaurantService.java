package ru.restaurantvote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.restaurantvote.model.Restaurant;
import ru.restaurantvote.repository.RestaurantRepository;

import java.util.List;


@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> getAll() {
        return repository.getAll();
    }

    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    public Restaurant create(Restaurant restaurant) {
        Assert.notNull(restaurant, "restaurant must not be null");
        return repository.save(restaurant);
    }

    public void update(Restaurant restaurant) {
        repository.save(restaurant);
    }

    public Restaurant get(int id) {
        return repository.getOne(id);
    }
}
