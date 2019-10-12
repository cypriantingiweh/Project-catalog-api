package com.first.springapp.firstwebspringapp.reposotory;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.first.springapp.firstwebspringapp.model.Category;



public interface CategoryRepository extends JpaRepositoryImplementation<Category, Integer> {

}
