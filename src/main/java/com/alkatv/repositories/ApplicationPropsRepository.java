package com.alkatv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alkatv.entities.ApplicationProps;

@Repository
public interface ApplicationPropsRepository extends JpaRepository<ApplicationProps, Integer>{

}


