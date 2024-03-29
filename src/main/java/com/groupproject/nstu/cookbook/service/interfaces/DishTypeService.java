package com.groupproject.nstu.cookbook.service.interfaces;

import com.groupproject.nstu.cookbook.entity.Cuisine;
import com.groupproject.nstu.cookbook.entity.DishType;
import com.groupproject.nstu.cookbook.entity.Ingredient;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface DishTypeService {

    Optional<DishType> findDishTypeById(Long id);

    void createDishType(DishType dishType);

    List<DishType> getAll();

    Optional<DishType> findDishTypeByName(String name);

    List<DishType> findDishTypeByNames(String names);

    ResponseEntity updateDishType(Long id, DishType newDishType);

    ResponseEntity deleteDishType(Long id);
}
