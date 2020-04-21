package com.marcelo.DojoNinjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.DojoNinjas.models.Category;
import com.marcelo.DojoNinjas.models.Product;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long>{

	Category save(Product product);

	Iterable<Category> findByProductsNotContains(Product product);
	

}
