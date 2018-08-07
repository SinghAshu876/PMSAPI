package com.alkatv.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alkatv.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByQrNo(Integer qrNo);
	Optional<User> findByMobNumber(String mobNumber);
	Optional<User> findByCustomerName(String customerName);

}
