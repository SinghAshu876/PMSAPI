package com.alkatv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alkatv.entities.ApplicationUsers;

@Repository
public interface ApplicationUsersRepository extends JpaRepository<ApplicationUsers, Integer> {

	@Query("SELECT a FROM ApplicationUsers a WHERE a.userName = :uname and a.password=:password")
	public ApplicationUsers findByUnameAndPwd(@Param(value = "uname") String uname, @Param(value = "password") String password);
	
	@Query("SELECT a FROM ApplicationUsers a WHERE a.userName = :uname")
	public ApplicationUsers isUnameExists(@Param(value = "uname") String uname);
}
