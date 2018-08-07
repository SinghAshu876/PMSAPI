package com.alkatv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alkatv.entities.FeesHistory;

@Repository
public interface FeesHistoryRepository extends JpaRepository<FeesHistory, Integer>{

}