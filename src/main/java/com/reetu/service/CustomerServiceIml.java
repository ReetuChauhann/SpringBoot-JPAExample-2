package com.reetu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reetu.beans.Customer;
import com.reetu.dao.CustomerRepository;

@Service
public class CustomerServiceIml  implements CustomerService {
	@Autowired
	CustomerRepository cusRepo;

	@Override
	public List<Customer> findByFnameStartingWith(String keyword) {
		// TODO Auto-generated method stub
		return cusRepo.findByFnameStartingWith(keyword);
	}

	@Override
	public List<Customer> findByFnameEndingWith(String keyword) {
		// TODO Auto-generated method stub
		return cusRepo.findByFnameEndingWith(keyword);
	}

	@Override
	public List<Customer> findByFnameContaining(String keyword) {
		// TODO Auto-generated method stub
		return cusRepo.findByFnameContaining(keyword);
	}

	@Override
	public List<Customer> findByFnameLike(String pattern) {
		// TODO Auto-generated method stub
		return cusRepo.findByFnameLike(pattern);
	}

	@Override
	public List<Customer> findByAddress(String add) {
		// TODO Auto-generated method stub
		return cusRepo.findByAddress(add);
	}

	@Override
	public List<Customer> findByLname(String keyword) {
		// TODO Auto-generated method stub
		return cusRepo.findByLname(keyword);
	}

	@Override
	public List<Customer> findByLnameStartingWith(String keyword) {
		// TODO Auto-generated method stub
		return cusRepo.findByLnameStartingWith(keyword);
	}

	@Override
	public List<Customer> findByIdIn(List<Integer> ids) {
		// TODO Auto-generated method stub
		return cusRepo.findByIdIn(ids);
	}

	@Override
	public List<Customer> getAllEmployee() {
		// TODO Auto-generated method stub
		return cusRepo.getAllEmployee();
	}

	@Override
	public List<Customer> getCustomerByFname(String depart) {
		// TODO Auto-generated method stub
		return cusRepo.getCustomerByFname(depart);
	}

	@Override
	public List<Customer> getCustomerByFnameAndLname(String fname, String lname) {
		// TODO Auto-generated method stub
		return cusRepo.getCustomerByFnameAndLname(fname, lname);
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return cusRepo.getCustomer();
	}

	@Override
	public Optional<Customer> findById(int id) {
		// TODO Auto-generated method stub
		return cusRepo.findById(id);
	}

	@Override
	public List<Customer> findByFname(String fname) {
		// TODO Auto-generated method stub
		return cusRepo.findByFname(fname);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(List<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Customer> findAll() {
		// TODO Auto-generated method stub
		return cusRepo.findAll();
	}

	@Override
	public Iterable<Customer> findAllById(List<Integer> ids) {
		// TODO Auto-generated method stub
		return cusRepo.findAllById(ids);
	}

	@Override
	public Customer save(Customer c) {
		// TODO Auto-generated method stub
		return cusRepo.save(c);
		
	}

	@Override
	public Iterable<Customer> saveAll(List<Customer> customers) {
		// TODO Auto-generated method stub
		return cusRepo.saveAll(customers);
		
	}

	@Override
	public void updateByAddress(String address, String Newaddress) {
		// TODO Auto-generated method stub
		
	}
	
	

}
