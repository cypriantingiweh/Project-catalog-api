package com.first.springapp.firstwebspringapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.first.springapp.firstwebspringapp.dto.ProductDTO;
import com.first.springapp.firstwebspringapp.model.Product;


@Service
public interface ProductService {
	
	List<ProductDTO> generate();
	ProductDTO generateOne(Integer id);
	Product add(ProductDTO productDTO,int categoryId);
	void edit(int id ,ProductDTO productDTO, int productId);
	Integer del(int id);
}
