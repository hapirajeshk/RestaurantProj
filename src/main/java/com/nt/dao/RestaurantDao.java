package com.nt.dao;

import java.util.List;

import com.nt.model.Restaurant;

public interface RestaurantDao {

	List<Restaurant> getRestaurantByCategory(String category);
}
