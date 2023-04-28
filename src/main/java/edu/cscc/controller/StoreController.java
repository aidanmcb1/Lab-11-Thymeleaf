package edu.cscc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.cscc.repository.StoreRepository;

@Controller
public class StoreController {
	@Autowired
	private StoreRepository repository;
	
	@GetMapping("/stores")
	public String getStores(Model model) {
		var currentstores = repository.findAll();
		model.addAttribute("stores", currentstores);
		return "stores";
	}
	
	@GetMapping("/stores/{id}")
	public String getStore(@PathVariable long id, Model model) {
		var currentstore = repository.findById(id);
		model.addAttribute("store", currentstore.get());
		return "store";
	}
}
