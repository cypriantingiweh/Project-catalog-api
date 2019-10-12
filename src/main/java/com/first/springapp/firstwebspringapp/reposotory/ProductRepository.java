package com.first.springapp.firstwebspringapp.reposotory;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.first.springapp.firstwebspringapp.model.Product;

@Repository
public interface ProductRepository extends JpaRepositoryImplementation<Product, Integer> {

}
