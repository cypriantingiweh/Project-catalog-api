package com.first.springapp.firstwebspringapp.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.springapp.firstwebspringapp.dto.CategoryDTO;
import com.first.springapp.firstwebspringapp.dto.ProductDTO;
import com.first.springapp.firstwebspringapp.model.Category;
import com.first.springapp.firstwebspringapp.model.Product;
import com.first.springapp.firstwebspringapp.reposotory.CategoryRepository;
import com.first.springapp.firstwebspringapp.reposotory.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	
	private ProductRepository repository;
	private CategoryRepository repositoryCat;
	
	@Autowired
	public ProductServiceImpl(ProductRepository repository ,CategoryRepository repositoryCat) {
	this.repository=repository;	
	this.repositoryCat=repositoryCat;
	}
	
	@Override
	public List<ProductDTO> generate() {
			 
		Iterable<Product> products= repository.findAll();
		List<ProductDTO> productDTOS = new ArrayList<ProductDTO>();
		for(Product product : products) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setId(product.getId());
			productDTO.setName(product.getName());
			productDTO.setQuantity(product.getQuantity());
			productDTO.setPrice(product.getPrice());
			productDTO.setCategory(product.getCategory());
			productDTOS.add(productDTO);
			
		}
			 return productDTOS;
	}

	@Override
	public Product add(ProductDTO productDTO,int id) {
		Product product = new Product();
		product.setName(productDTO.getName());
		product.setQuantity(productDTO.getQuantity());
		product.setPrice(productDTO.getPrice());
		productDTO.setCategory(new Category(id,""));
		product.setCategory(productDTO.getCategory());
		repository.save(product);
		return product;
	}

	@Override
	public ProductDTO generateOne(Integer id) {
		Product product= repository.findById(id).get();
		ProductDTO productDTO = new ProductDTO();
		productDTO.setId(product.getId());
		productDTO.setQuantity(product.getQuantity());
		productDTO.setName(product.getName());
		productDTO.setPrice(product.getPrice());
		productDTO.setCategory(product.getCategory());
		return productDTO;
	}

	@Override
	public void edit(int id ,ProductDTO productDTO,int catId) {
		Iterable<Product> products=repository.findAll();
		Category cat= repositoryCat.findById(catId).get();
		for(Product product : products) {
			if(id==product.getId() && cat==product.getCategory()) {
				product.setName(productDTO.getName());
				product.setQuantity(productDTO.getQuantity());
				product.setPrice(productDTO.getPrice());
				repository.save(product);
				
			}
		}
	}

	@Override
	public Integer del(int id) {
		ProductDTO categoryDTO = new ProductDTO();
		repository.deleteById(id);
		return categoryDTO.getId();
		
	}
}
