package com.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelservice.entity.RatingEntity;
import com.hotelservice.service.RatingServiceimpl;

@RestController
public class RatingController {
	@Autowired
	private RatingServiceimpl ratingServiceimpl;
	
	@PostMapping("/created")
	public RatingEntity created1(@RequestBody RatingEntity ratingEntity) {
		return ratingServiceimpl.created(ratingEntity);
	}
@GetMapping("/getall")
public List<RatingEntity> getall1(){
	return ratingServiceimpl.getall();
}
@GetMapping("/get/{userid}")
public List<RatingEntity> getuserid1(@PathVariable Integer userid){
	return ratingServiceimpl.getuserid(userid);
}
@GetMapping("/gethotelid/{hotelid}")
public List<RatingEntity> gethotelid1(@PathVariable Integer hotelid){
	return ratingServiceimpl.gethotelid1(hotelid);
}
	
	
}
