package com.marcelo.DojoNinjas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.marcelo.DojoNinjas.models.Category;
import com.marcelo.DojoNinjas.models.Product;
import com.marcelo.DojoNinjas.repository.CategoryRepo;
import com.marcelo.DojoNinjas.repository.ProductRepo;

@Service
public class Serv {
	private final CategoryRepo categoryrepo;
	private final ProductRepo productrepo;
	
	public Serv(CategoryRepo categoryrepo,ProductRepo productrepo) {
		this.categoryrepo = categoryrepo;
		this.productrepo = productrepo;
	}
	
	public Product newProduct(Product product) {
		return productrepo.save(product);
	}
	
	public Category newCategory(Category category) {
		return categoryrepo.save(category);
	}
	public Product idProduct(Long id) {
		Optional<Product> product = productrepo.findById(id);
		if(product.isPresent()) {
			return product.get();
		}
		else {
			return null;
		}
	}
	public Category idCategory(Long id) {
		Optional<Category> category = categoryrepo.findById(id);
		if(category.isPresent()) {
			return category.get();
		}
		else {
			return null;
		}
	}
	
	public Iterable<Product> productsForCategory(Category category) {
		return productrepo.findByCategoriesNotContains(category);
	}
	public Iterable<Category> categoryForProducts(Product product){
		return categoryrepo.findByProductsNotContains(product);
	}

	public Category addProductToCategory(Product product) {
		return categoryrepo.save(product);
		
	}
}
	

