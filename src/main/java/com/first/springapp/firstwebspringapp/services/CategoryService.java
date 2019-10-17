package com.first.springapp.firstwebspringapp.services;

import java.util.List;

import com.first.springapp.firstwebspringapp.dto.CategoryDTO;
import com.first.springapp.firstwebspringapp.model.Category;



public interface CategoryService {
	List<CategoryDTO> generate();
	CategoryDTO generateOne(Integer id);
	Category add(CategoryDTO categoryDTO);
	void edit(int id ,CategoryDTO categoryDTO);
	Integer del(int id);

}
