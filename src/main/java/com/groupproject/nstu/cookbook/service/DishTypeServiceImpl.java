package com.groupproject.nstu.cookbook.service;

import com.groupproject.nstu.cookbook.entity.DishContent;
import com.groupproject.nstu.cookbook.entity.DishType;
import com.groupproject.nstu.cookbook.repository.DishContentRepository;
import com.groupproject.nstu.cookbook.repository.DishTypeRepository;
import com.groupproject.nstu.cookbook.service.interfaces.DishTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishTypeServiceImpl implements DishTypeService {

    private final DishTypeRepository dishTypeRepository;

    public DishTypeServiceImpl(DishTypeRepository dishTypeRepository) {
        this.dishTypeRepository = dishTypeRepository;
    }

    @Override
    public Optional<DishType> findDishTypeById(Long id) {
        return dishTypeRepository.findById(id);
    }

    @Override
    public void createDishType(DishType dishContent) {
        dishTypeRepository.save(dishContent);
    }

    @Override
    public List<DishType> getAll() {
        return dishTypeRepository.findAll();
    }
}
