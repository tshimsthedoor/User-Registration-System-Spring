package com.thedorcode.tshims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thedorcode.tshims.dto.UserDTO;



@Repository
public interface UserJpaRepository extends JpaRepository<UserDTO, Long> {
	
	UserDTO findByName(String name); 

}
