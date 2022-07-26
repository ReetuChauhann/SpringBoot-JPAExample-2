package com.reetu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.reetu.beans.Customer;

public interface CustomerService {
	
	
	
	public List<Customer> findByFnameStartingWith(String keyword);
    public List<Customer> findByFnameEndingWith(String keyword);
    public List<Customer> findByFnameContaining(String keyword);
    public List<Customer> findByFnameLike(String pattern);
    public List<Customer> findByAddress(String add);
    public List<Customer> findByLname(String keyword);
    public List<Customer> findByLnameStartingWith(String keyword);
    public List<Customer> findByIdIn(List<Integer> ids);
    public List<Customer> getAllEmployee();
    public List<Customer> getCustomerByFname(@Param("n") String depart);
    public List<Customer> getCustomerByFnameAndLname(String fname,String lname);
    public List<Customer> getCustomer();
    public Optional<Customer> findById(int id);
    public List<Customer> findByFname(String fname);
    public void  deleteById(int id);
    public void deleteAll();
    public void deleteAll(List<Integer> ids);
    public Iterable<Customer> findAll();
    public Iterable<Customer> findAllById(List<Integer> ids);
    public Customer save(Customer c);
    public Iterable<Customer> saveAll(List<Customer> customers);
    public void updateByAddress(String address, String Newaddress);
    
}
