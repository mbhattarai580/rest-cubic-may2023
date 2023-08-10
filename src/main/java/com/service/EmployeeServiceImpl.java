package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MagicDaoRepository;
import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	MagicDaoRepository magicDaoRepository;

	@Override
	public void registerEmp(EmployeeDTO employeeDTO) {
		
		EmployeeEntity employeeEntity =new EmployeeEntity();
		BeanUtils.copyProperties(employeeDTO, employeeEntity);
		
		magicDaoRepository.save(employeeEntity);
		
		
		
	}
	
	
	
	

	
	
	

}
