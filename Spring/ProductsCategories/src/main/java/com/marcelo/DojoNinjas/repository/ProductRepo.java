package com.marcelo.DojoNinjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.DojoNinjas.models.Category;
import com.marcelo.DojoNinjas.models.Product;


@Repository
public interface ProductRepo extends CrudRepository<Product, Long>{
	List<Product> findByCategoriesNotContains(Category category);

	

}
