package com.nt.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nt.model.Restaurant;
import com.nt.model.RestaurantCategory;

public class RestaurantDaoImpl implements RestaurantDao{
	@Autowired
	SessionFactory sessionfactory;
	
    @Override
	public List<Restaurant> getRestaurantByCategory(String category){
		
		List<Restaurant> lrs=new ArrayList<>();
		
		Session ses=this.sessionfactory.getCurrentSession();
		SQLQuery query=ses.createSQLQuery("select r.restaurantid from Restaurant r ,restaurantcategory c where r.categoryid=c.categoryid and c.categoryname=:categoryName");
		query.setString("categoryName",category);
	    
		 List <Object[]> list= query.list();
		
	
		for(Object ob:list){
			BigDecimal bd=(BigDecimal)ob;
			
			int id=bd.intValueExact();
			
			Restaurant res=(Restaurant)ses.get(Restaurant.class,id);
			lrs.add(res);
		}
		
		
		return lrs;
	}
	
	
	
	

}
