package com.groupproject.nstu.cookbook.service.interfaces;

import com.groupproject.nstu.cookbook.entity.Cuisine;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CuisineService {

    void createCuisine(Cuisine cuisine);

    List<Cuisine> getAll();

    Optional<Cuisine> findCuisineById(Long id);

    Optional<Cuisine> findCuisineByName(String name);

    List<Cuisine> findCuisineByNames(String names);

    ResponseEntity updateCuisine(Long id, Cuisine newCuisine);

    ResponseEntity deleteCuisine(Long id);

}
