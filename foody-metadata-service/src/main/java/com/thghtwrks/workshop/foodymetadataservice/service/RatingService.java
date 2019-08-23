package com.thghtwrks.workshop.foodymetadataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thghtwrks.workshop.foodymetadataservice.domain.Rating;
import com.thghtwrks.workshop.foodymetadataservice.repository.RatingRepository;

@Service
public class RatingService {
	
	@Autowired
	RatingRepository repo;
	
	public void addRating(Rating review) {
		repo.save(review);
	}
}
