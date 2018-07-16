package com.sergiu.lofo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sergiu.lofo.model.CategoryModel;
import com.sergiu.lofo.repository.CategoryRepository;
import com.sergiu.lofo.transformer.Transformer;

@Controller
@Transactional
@RequestMapping(path = "/categories", produces = "application/json")
public class CategoryController {
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	Transformer transformer;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody Iterable<CategoryModel> getAllCategoris() {
		return transformer.categorisFromEntityToModel(categoryRepository.findAll());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody CategoryModel getCategoryById(@PathVariable("id") Integer id) {
		return transformer.categoryFromEntityToModel(categoryRepository.findById(id).get());
	}
}
