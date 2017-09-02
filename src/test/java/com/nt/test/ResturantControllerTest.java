package com.nt.test;

import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;

import com.nt.controller.RestaurantController;
import com.nt.service.RestaurantServiceImpl;

@RunWith(SpringRunner.class)
	@ContextConfiguration(classes = {TestContext.class, WebAppContext.class})
	@WebAppConfiguration
	public class ResturantControllerTest {
	 
	   // private MockMvc mockMvc;
	 @InjectMocks
	 RestaurantController resturantContrlloer;
	    @Autowired
	    private RestaurantServiceImpl restaurantService;;
	 
	    //Add WebApplicationContext field here.
	 
	    //The setUp() method is omitted.
	 String categoryName=null;
	    @Test
	    public void   checkCategoryNull(String categoryName){
	    	
	    	resturantContrlloer.getRestaurantNameByCategory(categoryName);
	    	
	    		assertNull(categoryName);
	    	
	    
			
	 
	    }
	}
	
	
	
	
	


