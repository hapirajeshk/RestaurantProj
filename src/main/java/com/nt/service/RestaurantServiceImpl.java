package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.RestaurantDao;
import com.nt.dao.RestaurantDaoImpl;
import com.nt.model.Restaurant;
@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	RestaurantDao restaurantDao;
	@Override
	@Transactional
	public List<Restaurant> getRestaurantNameByCategory(String categoryName){
		
		
		List<Restaurant> rs= restaurantDao.getRestaurantByCategory(categoryName);
		
		return rs;
		
	}

}
