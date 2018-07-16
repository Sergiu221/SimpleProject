package com.sergiu.lofo.transformer;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sergiu.lofo.entity.AddEntity;
import com.sergiu.lofo.entity.CategoryEntity;
import com.sergiu.lofo.entity.CityEntity;
import com.sergiu.lofo.entity.view.AddViewEntity;
import com.sergiu.lofo.model.AddModel;
import com.sergiu.lofo.model.AddViewModel;
import com.sergiu.lofo.model.CategoryModel;
import com.sergiu.lofo.model.CityModel;
import com.sergiu.lofo.utils.AddEnum;

@Component
public class Transformer {

	public CityModel cityFromEntityToModel(CityEntity entity) {
		Integer id = entity.getIdCity();
		String name = entity.getNameCity();
		return new CityModel(id, name);
	}

	public Iterable<CityModel> citiesFromEntityToModel(Iterable<CityEntity> listEntities) {
		List<CityModel> list = new LinkedList<>();

		for (CityEntity entity : listEntities) {
			list.add(cityFromEntityToModel(entity));
		}
		return list;
	}

	public CategoryModel categoryFromEntityToModel(CategoryEntity entity) {
		Integer id = entity.getCategoryId();
		String name = entity.getCategoryName();
		return new CategoryModel(id, name);
	}

	public Iterable<CategoryModel> categorisFromEntityToModel(Iterable<CategoryEntity> listEntities) {
		List<CategoryModel> list = new LinkedList<>();
		for (CategoryEntity entity : listEntities) {
			list.add(categoryFromEntityToModel(entity));
		}
		return list;
	}

	public AddModel addFromEntityToModel(AddEntity entity) {
		AddModel model = new AddModel();
		model.setAddId(entity.getAddId());
		model.setCategoryId(entity.getCategoryId());
		model.setCityId(entity.getCityId());
		model.setDescription(entity.getDescription());
		model.setImage(entity.getImage());
		model.setType(entity.getType());
		model.setUserId(entity.getUserId());
		model.setDate(entity.getDate());
		return model;
	}

	public Iterable<AddModel> addsFromEntityToModel(Iterable<AddEntity> listEntities) {
		List<AddModel> list = new LinkedList<>();
		for (AddEntity entity : listEntities) {
			list.add(addFromEntityToModel(entity));
		}
		return list;
	}

	private AddViewModel addFromEntityToModel(AddViewEntity entity) {
		AddViewModel model = new AddViewModel();
		model.setId(entity.getId());
		model.setCategory(entity.getCategory());
		model.setCity(entity.getCity());
		model.setDescription(entity.getDescription());
		model.setImage(entity.getImage());
		model.setType(AddEnum.getMessge(entity.getType()));
		model.setUsername(entity.getUsername());
		model.setDate(entity.getDate());
		return model;
	}
	
	public Iterable<AddViewModel> addViewFromEntityToModel(List<AddViewEntity> listEntities) {
		List<AddViewModel> list = new LinkedList<>();
		for (AddViewEntity entity : listEntities) {
			list.add(addFromEntityToModel(entity));
		}
		return list;
	}

}
