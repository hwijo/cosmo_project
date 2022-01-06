package com.reserv.myapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reserv.myapp.model.NoticeEntity;


public interface NoticeRepository extends JpaRepository<NoticeEntity, Long> {

	NoticeEntity findByNo(int no);


}
