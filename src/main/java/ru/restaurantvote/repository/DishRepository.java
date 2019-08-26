package ru.restaurantvote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.restaurantvote.model.Dish;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer> {

    @Query("SELECT d FROM Dish d WHERE d.restaurant.id=:restId")
    List<Dish> getAll(@Param("restId") int restId);
}
