package com.nt.service;

import java.util.List;

import com.nt.model.Restaurant;

public interface RestaurantService {
	
	public List<Restaurant> getRestaurantNameByCategory(String categoryName);

}
