package com.sergiu.lofo.model;

public class CategoryModel {

	private Integer categoryId;

	private String categoryName;

	public CategoryModel(Integer id, String name) {
		this.categoryId = id;
		this.categoryName = name;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
