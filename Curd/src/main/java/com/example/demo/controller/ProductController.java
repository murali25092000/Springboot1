package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Product;
import com.example.demo.services.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductRepository repo;
	
	@GetMapping({"","/"})
	public String show(Model model) {
		List<Product> products=repo.findAll();
		model.addAttribute("products",products);
		return "products/index";
		
	}
	

}
