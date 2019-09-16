package ru.restaurantvote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.restaurantvote.model.Dish;
import ru.restaurantvote.repository.DishRepository;

import java.util.List;

@Service
public class DishService {

    @Autowired
    private DishRepository repository;

    public List<Dish> getAll(int restId) {
        return repository.getAll(restId);
    }

    public Dish get(int id) {
        return repository.get(id);
    }

    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    public Dish create(Dish dish) {
        return repository.save(dish);
    }

    public void update(Dish dish) {
        repository.save(dish);
    }
}
