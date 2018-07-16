package com.sergiu.lofo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sergiu.lofo.model.AddViewModel;
import com.sergiu.lofo.repository.AddRepository;
import com.sergiu.lofo.transformer.Transformer;
import com.sergiu.lofo.utils.AddEnum;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@Transactional
@RequestMapping(path = "/adds", produces = "application/json")
public class AddController {

	@Autowired
	private AddRepository addRepository;

	@Autowired
	private Transformer transformer;

	@RequestMapping(path = "/types", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody Iterable<AddEnum> getAllTypes() {
		return Arrays.asList(AddEnum.values());
	}

	/*@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody Iterable<AddModel> getAllAdds(@RequestParam(value = "userId", required = false) Integer user,
			@RequestParam(value = "type", required = false) Integer type,
			@RequestParam(value = "cityId", required = false) Integer cityId,
			@RequestParam(value = "categoryId", required = false) Integer categoryId) {

		System.out.println("Am intrat in metoda!");

		if (user != null) {
			return transformer.addsFromEntityToModel(addRepository.findByUser(user));
		} else if ((type != null) && (cityId != null) && (categoryId != null)) {
			return transformer
					.addsFromEntityToModel(addRepository.findByTypeCityCategory(type, cityId, categoryId));
		} else if ((type != null) && (cityId != null)) {
			return transformer.addsFromEntityToModel(addRepository.findByTypeCity(type, cityId));
		} else if ((type != null) && (categoryId != null)) {
			return transformer.addsFromEntityToModel(addRepository.findTypeCategory(type, categoryId));
		} else if ((cityId != null) && (categoryId != null)) {
			return transformer.addsFromEntityToModel(addRepository.findByCityCategory(cityId, categoryId));
		} else if (type != null) {
			return transformer.addsFromEntityToModel(addRepository.findByType(type));
		} else if (cityId != null) {
			return transformer.addsFromEntityToModel(addRepository.findByCity(cityId));
		} else if (categoryId != null) {
			return transformer.addsFromEntityToModel(addRepository.findByCategory(categoryId));
		}

		return transformer.addsFromEntityToModel(addRepository.findAll());
	}*/
	
	@RequestMapping(path = "/adds-view", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody Iterable<AddViewModel> getAllAddsView() {
		return transformer.addViewFromEntityToModel(addRepository.getAddViews());
	}
}
