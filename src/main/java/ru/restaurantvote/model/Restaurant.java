package ru.restaurantvote.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "restaurants", uniqueConstraints = {@UniqueConstraint(columnNames = "name", name = "restaurants_unique_name_idx")})
public class Restaurant extends AbstractBaseEntity {
    @Column(name = "votes", nullable = false, columnDefinition = "int default 0")
    private int votes;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "restaurant")
    private List<Dish> lunchMenu;

    public Restaurant() {
    }

    public Restaurant(Integer id, String name, int votes) {
        super(id, name);
        this.votes = votes;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public void setLunchMenu(List<Dish> lunchMenu) {
        this.lunchMenu = lunchMenu;
    }

    public List<Dish> getLunchMenu() {
        return lunchMenu;
    }
}
