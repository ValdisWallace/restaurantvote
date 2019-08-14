package ru.restaurantvote.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.restaurantvote.model.Dish;
import ru.restaurantvote.repository.DishRepository;
import ru.restaurantvote.repository.RestaurantRepository;

import java.util.List;

@Controller
public class RootController {
    @Autowired
    private DishRepository dishRepository;

    @Autowired
    private RestaurantRepository restRepository;

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/dishes")
    public String getDishes(Model model) {
        model.addAttribute("dishes", dishRepository.getAll(100003));
        return "dishes";
    }

//    @GetMapping("/restaurants")
//    public String getRestaurants(Model model) {
//        model.addAttribute("restaurants", restRepository.findAll());
//        return "restaurants";
//    }
}
