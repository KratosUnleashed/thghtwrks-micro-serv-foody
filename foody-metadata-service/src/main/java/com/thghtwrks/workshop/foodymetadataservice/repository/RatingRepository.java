package com.thghtwrks.workshop.foodymetadataservice.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thghtwrks.workshop.foodymetadataservice.domain.Rating;

@Repository
@Transactional
public interface RatingRepository extends JpaRepository<Rating, Long>{

}
