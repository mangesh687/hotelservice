package com.hotelservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RatingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ratingid;
	private Integer userid;
	private Integer hotelid;
	private Integer rating;
	private String feedback;
	public Integer getRatingid() {
		return ratingid;
	}
	public void setRatingid(Integer ratingid) {
		this.ratingid = ratingid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getHotelid() {
		return hotelid;
	}
	public void setHotelid(Integer hotelid) {
		this.hotelid = hotelid;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "RatingEntity [ratingid=" + ratingid + ", userid=" + userid + ", hotelid=" + hotelid + ", rating="
				+ rating + ", feedback=" + feedback + "]";
	}
	public RatingEntity(Integer ratingid, Integer userid, Integer hotelid, Integer rating, String feedback) {
		super();
		this.ratingid = ratingid;
		this.userid = userid;
		this.hotelid = hotelid;
		this.rating = rating;
		this.feedback = feedback;
	}
	public RatingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
