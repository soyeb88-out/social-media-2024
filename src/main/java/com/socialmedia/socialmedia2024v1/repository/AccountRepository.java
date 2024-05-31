package com.socialmedia.socialmedia2024v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.socialmedia.socialmedia2024v1.model.Account;
import com.socialmedia.socialmedia2024v1.util.Service;

public interface AccountRepository extends JpaRepository<Account,Long>{

	@Query(value="select user_id from socialmedia.account where user_id = :userId", nativeQuery = true)
	String findByUserId(String userId);
	
	@Query(value = Service.GET_BY_USERID_AND_PASSWORD,  nativeQuery = true)
	String findUserIdByUserIdAndPassword(String userId, String password);

	@Query(value = "select name from socialmedia.account where user_id = :id",  nativeQuery = true)
	String findNameByUserId(String id);

}