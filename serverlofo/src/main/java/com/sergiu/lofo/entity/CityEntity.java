package com.sergiu.lofo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class CityEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_city")
	private Integer idCity;

	@Column(name = "name_city")
	private String nameCity;

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
