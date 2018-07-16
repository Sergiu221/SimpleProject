package com.sergiu.lofo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adds")
public class AddEntity {

	@Id
	@Column(name = "id_add")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addId;

	@Column(name = "id_user")
	private Integer userId;

	@Column(name = "id_category")
	private Integer categoryId;

	@Column(name = "id_city")
	private Integer cityId;

	@Column(name = "description_add")
	private String description;

	@Column(name = "image_add")
	private String image;

	@Column(name = "type_add")
	private Integer type;

	@Column(name = "date_add")
	private Date date;

	public Integer getAddId() {
		return addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
