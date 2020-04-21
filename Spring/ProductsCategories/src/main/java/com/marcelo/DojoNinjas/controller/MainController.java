package com.marcelo.DojoNinjas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.marcelo.DojoNinjas.models.Category;
import com.marcelo.DojoNinjas.models.Product;
import com.marcelo.DojoNinjas.service.Serv;

@Controller
public class MainController {
	private final Serv serv;
	
	
	public MainController(Serv serv) {
		this.serv = serv;
	}
	
	
	@RequestMapping("/product")
	public String view(@ModelAttribute("product") Product product) {
		return "NewProduct.jsp";
	}
	
	@RequestMapping(value="/add/product", method=RequestMethod.POST)
	public String newProduct(@ModelAttribute("product") Product product) {
		this.serv.newProduct(product);
		return "redirect:/product";
	}
	
	@RequestMapping("/category")
	public String viewCategory(@ModelAttribute("category") Category category) {
		return "NewCategory.jsp";
	}
	
	@RequestMapping(value="/add/category", method=RequestMethod.POST)
	public String newCategory(@ModelAttribute("category") Category category) {
		this.serv.newCategory(category);
		return "redirect:/category";
	}
	
	@GetMapping("/product/{id}")
	public String productId(@PathVariable("id")Long id,Model model) {
		Product product = serv.idProduct(id);
		model.addAttribute("product",product);
		model.addAttribute("category",serv.categoryForProducts(product));
		return "ShowProduct.jsp";
	}
	@PostMapping("/product/{id}")
	public String addCategory(@PathVariable("id")Long id,@RequestParam("category")Long catId) {
		Product prod = serv.idProduct(id);
		Category category = serv.idCategory(catId);
		prod.getCategories().add(category);
		serv.newProduct(prod);
		return "redirect:/product/"+id;
	}
	
	
	
	@GetMapping("/category/{id}")
	public String categoryId(@PathVariable("id")Long id,Model model) {
		Category category = serv.idCategory(id);
		model.addAttribute("category",category);
		model.addAttribute("product", serv.productsForCategory(category));
		return "ShowCategory.jsp";
	}
	@PostMapping("/category/{id}")
	public String addProduct(@PathVariable("id")Long id,@RequestParam("product")Long proId) {
		Product prod = serv.idProduct(proId);
		Category category = serv.idCategory(id);
		category.getProducts().add(prod);
		serv.newCategory(category);
		return "redirect:/category/"+id;
	}
	
	
}
