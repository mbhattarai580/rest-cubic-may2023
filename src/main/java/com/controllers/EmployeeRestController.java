package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.EmployeeDTO;
import com.dto.ResponseDTO;
import com.service.EmployeeService;

@RestController

public class EmployeeRestController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	 @PostMapping("/employeeRegistration")
	   public ResponseDTO registerEmployee(@RequestBody EmployeeDTO employeeDTO) {
		   employeeService.registerEmp(employeeDTO);
		  ResponseDTO responseDTO =new ResponseDTO();
		  
		  responseDTO.setMessage("registration done succeessfully");
		  
		  responseDTO.setStatus(201);
		  
		  return responseDTO;   
		   
		
	   }
	   
	
	
	
	
	
	

}
