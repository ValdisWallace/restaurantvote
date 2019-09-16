package ru.restaurantvote.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.restaurantvote.model.Dish;
import ru.restaurantvote.service.DishService;
import ru.restaurantvote.service.RestaurantService;

import java.util.List;


@RestController
@RequestMapping(value = RestaurantController.REST_URL + "/{restId}/lunch", produces = MediaType.APPLICATION_JSON_VALUE)
public class DishController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private DishService dishService;

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public List<Dish> getAll(@PathVariable int restId) {
        log.info("getAll");
        return restaurantService.get(restId).getLunchMenu();
    }

    @GetMapping("{id}")
    public Dish get(@PathVariable int id) {
        log.info("get dish");
        return dishService.get(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        log.info("delete dish {}", id);
        dishService.delete(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Dish create(@RequestBody Dish dish, @PathVariable int restId) {
//        dish.getRestaurant().setId(restId);
        return dishService.create(dish);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(Dish dish) {
        log.info("update {}", dish);
        dishService.update(dish);
    }
}
