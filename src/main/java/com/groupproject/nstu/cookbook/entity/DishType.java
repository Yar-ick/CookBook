package com.groupproject.nstu.cookbook.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dish_type")
public class DishType implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "dishType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dish> dishList = new ArrayList<>();

    public DishType() {}

    public DishType(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DishType(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dish.setDishType(this);
        dishList.add(dish);
    }

    public void removeDish(Dish dish) {
        dishList.remove(dish);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DishType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
