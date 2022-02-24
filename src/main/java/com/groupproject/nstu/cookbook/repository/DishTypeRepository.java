package com.groupproject.nstu.cookbook.repository;

import com.groupproject.nstu.cookbook.entity.Cuisine;
import com.groupproject.nstu.cookbook.entity.DishType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DishTypeRepository extends JpaRepository<DishType, Long> {

    @Query("select dt from DishType dt where dt.name = :name")
    Optional<DishType> getDishTypeByName(@Param("name") String name);

}