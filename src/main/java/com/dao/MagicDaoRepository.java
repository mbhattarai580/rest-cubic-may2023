package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.EmployeeEntity;

public interface MagicDaoRepository extends JpaRepository<EmployeeEntity,Integer>{

	
	
}