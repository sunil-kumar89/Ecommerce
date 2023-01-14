package com.example.demo.service;

import com.example.demo.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepo categoryRepo;
    public void createCategory(catecory catecory) {
        CategoryRepo.save(catecory);

    }
    public List<category>  listCategory() {
        return categoryRepo.findAll();
    }
}
