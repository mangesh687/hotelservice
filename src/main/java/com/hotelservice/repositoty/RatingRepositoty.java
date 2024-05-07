package com.hotelservice.repositoty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelservice.entity.RatingEntity;

@Repository
public interface RatingRepositoty extends JpaRepository<RatingEntity,Integer >{
	//userid
	List<RatingEntity> findByUserid(Integer userid);
	List<RatingEntity> findByHotelid(Integer hotelid);

}
