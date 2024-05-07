package com.hotelservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.entity.RatingEntity;
import com.hotelservice.repositoty.RatingRepositoty;

@Service
public class RatingServiceimpl implements RatingService {
	@Autowired
	private RatingRepositoty ratingRepositoty;

	@Override
	public RatingEntity created(RatingEntity ratingEntity) {
		// TODO Auto-generated method stub
		return ratingRepositoty.save(ratingEntity);
	}

	@Override
	public List<RatingEntity> getall() {
		// TODO Auto-generated method stub
		return ratingRepositoty.findAll();
	}

	@Override
	public List<RatingEntity> getuserid(Integer userid) {
		// TODO Auto-generated method stub
		return ratingRepositoty.findByUserid(userid);
	}

	@Override
	public List<RatingEntity> gethotelid1(Integer hotelid) {
		// TODO Auto-generated method stub
		return ratingRepositoty.findByHotelid(hotelid);
	}

//	@Override
//	public List<RatingEntity> gethotelid(Integer hotelid) {
//		// TODO Auto-generated method stub
//		return ratingRepositoty.findByHotelid(hotelid);
//	}

}
