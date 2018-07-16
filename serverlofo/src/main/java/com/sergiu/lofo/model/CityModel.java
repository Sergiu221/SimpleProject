package com.sergiu.lofo.model;

public class CityModel {

	private Integer idCity;

	private String nameCity;

	public CityModel(Integer id, String name) {
		this.idCity = id;
		this.nameCity = name;
	}

	public Integer getIdCity() {
		return idCity;
	}

	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

}
