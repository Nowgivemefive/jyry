package com.ffive.jyry.service.impl;

import java.util.List;

import com.ffive.jyry.beans.Employee;
import com.ffive.jyry.dao.impl.EmployeeDaoImpl;
import com.ffive.jyry.dao.inter.EmployeeDao;
import com.ffive.jyry.service.inter.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao employeeDao =new EmployeeDaoImpl();
	@Override
	public List<Employee> findAll(int e_is) {
		// TODO Auto-generated method stub
		return employeeDao.findAll(e_is);
	}

}
