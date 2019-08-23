package com.thghtwrks.workshop.foodymetadataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.thghtwrks.workshop.foodymetadataservice.domain.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

}
