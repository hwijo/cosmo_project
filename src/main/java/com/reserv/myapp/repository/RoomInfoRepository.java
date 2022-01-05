package com.reserv.myapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reserv.myapp.model.RoomInfoVO;


public interface RoomInfoRepository extends JpaRepository<RoomInfoVO, Long> {

	RoomInfoVO findByNo(int no);


}
