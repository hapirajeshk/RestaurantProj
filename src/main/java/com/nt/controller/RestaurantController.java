package com.nt.controller;


import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Restaurant;
import com.nt.service.RestaurantService;


@RequestMapping("/restaurant")
@RestController
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;

	@RequestMapping(value = "/{categoryName}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON)
	public List<Restaurant> getRestaurantNameByCategory(@PathVariable final String categoryName){
	
		List<Restaurant> res= restaurantService.getRestaurantNameByCategory(categoryName);
		for(Restaurant rs:res){
			System.out.println(rs);
		}
		return res;
	}
	
	
}
