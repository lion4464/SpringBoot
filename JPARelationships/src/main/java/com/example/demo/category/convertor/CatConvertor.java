package com.example.demo.category.convertor;

import com.example.demo.category.domain.Category;
import com.example.demo.category.domain.CategoryDTO;
import org.springframework.stereotype.Component;

@Component
public class CatConvertor {
    public CategoryDTO convert(CategoryDTO to, Category from){
        to.setId(from.getId());
        to.setName(from.getName());
        return to;
    }
}
