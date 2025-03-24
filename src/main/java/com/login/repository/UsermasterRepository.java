package com.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.entity.Usermaster;

@Repository
public interface UsermasterRepository extends JpaRepository<Usermaster, Long>{
	
	 Optional<Usermaster> findByUsername(String username);
}
