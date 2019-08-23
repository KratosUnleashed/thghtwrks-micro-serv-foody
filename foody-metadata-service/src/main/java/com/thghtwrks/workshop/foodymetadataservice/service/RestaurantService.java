package com.thghtwrks.workshop.foodymetadataservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thghtwrks.workshop.foodymetadataservice.domain.Restaurant;
import com.thghtwrks.workshop.foodymetadataservice.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	RestaurantRepository repo;
	
	public List<Restaurant> getAllRestaurants() {
		return repo.findAll();
	}

	public Restaurant getRestaurantById(long id) {
		return repo.findById(id).get();
	}

}
