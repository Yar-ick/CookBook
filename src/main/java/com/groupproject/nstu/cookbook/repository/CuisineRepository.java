package com.groupproject.nstu.cookbook.repository;

import com.groupproject.nstu.cookbook.entity.Cuisine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuisineRepository extends JpaRepository<Cuisine, Long> {
}
