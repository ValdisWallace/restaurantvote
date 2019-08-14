package ru.restaurantvote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.restaurantvote.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
