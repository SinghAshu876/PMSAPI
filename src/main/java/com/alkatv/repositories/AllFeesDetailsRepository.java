package com.alkatv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alkatv.entities.AllFeesDetails;

@Repository
public interface AllFeesDetailsRepository extends JpaRepository<AllFeesDetails, Integer>{

}
