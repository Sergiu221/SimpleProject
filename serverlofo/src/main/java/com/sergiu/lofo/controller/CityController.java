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

import com.sergiu.lofo.model.CityModel;
import com.sergiu.lofo.repository.CityRepository;
import com.sergiu.lofo.transformer.Transformer;

@Controller
@Transactional
@RequestMapping(path = "/cities", produces = "application/json")
public class CityController {

	@Autowired
	CityRepository cityRepository;
	@Autowired
	Transformer transformer;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody Iterable<CityModel> getAllCities() {
		return transformer.citiesFromEntityToModel(cityRepository.findAll());
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody CityModel getCityById(@PathVariable( "id" ) Integer id) {
		return transformer.cityFromEntityToModel(cityRepository.findById(id).get());
	}
}
