package com.mobis.demo.service.impl;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobis.demo.entity.Employee;
import com.mobis.demo.repository.EmployeeRepository;
import com.mobis.demo.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;



@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public Employee createEmployee(Employee emp) {
		return empRepository.save(emp);
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		java.util.Optional<Employee> OptionalEmp = empRepository.findById(empId);
		return OptionalEmp.get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empRepository.findAll();
		}


	@Override
	public void deleteEmployee(Long empId) {
		empRepository.deleteById(empId);
		
	}

	/*@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public Employee updateEmployee(Employee employee) {
		java.util.Optional<Employee> emp = empRepository.findById(employee.getId());
		
		if(emp.isPresent()) {
			Employee empUpdate = emp.get();
			
			empUpdate.setId(employee.getId());
			empUpdate.setFirstName(employee.getFirstName());
			empUpdate.setLastName(employee.getLastName());
			empUpdate.setEmailId((employee.getEmailId()));
		    empRepository.save(empUpdate);
		    return empUpdate;
	}
		return employee;
	}
}
