package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Restaurant {
	@Id
	@Column(length=3)
	private int restaurantId;
	@Column(length=50)
	private String restaurantName;
	@Column(length=50)
	private String address;
	private int categoryId;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurant_id) {
		this.restaurantId = restaurant_id;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurant_name(String restaurant_name) {
		this.restaurantName = restaurant_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", address="
				+ address + ", categoryId=" + categoryId + "]";
	}
	

}
