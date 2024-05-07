package com.hotelservice.service;

import java.util.List;

import com.hotelservice.entity.RatingEntity;

public interface RatingService {
	public RatingEntity created(RatingEntity ratingEntity);
	
	//get all rating 
	List<RatingEntity> getall();
	List<RatingEntity> getuserid(Integer userid);
	List<RatingEntity> gethotelid1(Integer hotelid);

}
