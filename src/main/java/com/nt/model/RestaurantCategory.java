package com.nt.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class RestaurantCategory {
	@Id
	@Column(length=3)
	private int categoryId;
	private String categoryName;
	@OneToMany(targetEntity=Restaurant.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="categoryId")
	private Set<Restaurant> restaurants;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Set<Restaurant> getRestaurants() {
		return restaurants;
	}
	public void setRestaurants(Set<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	
	

}
