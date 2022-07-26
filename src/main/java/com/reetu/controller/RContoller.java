package com.reetu.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reetu.beans.Customer;
import com.reetu.service.CustomerService;

@RestController
public class RContoller {
	
	@Autowired
	CustomerService cusSer;
	
	@RequestMapping("/")
	public String welcomepage() {
		return "Welcome!";
	}
	
	
	@GetMapping("/getbyid/{id}")
	public Optional<Customer> getbyid(@PathVariable("id") int id) {
		return cusSer.findById(id);
	}
	
	@GetMapping("/getall")
	public List<Customer> findall(){
		Iterable<Customer> itr=cusSer.findAll();
		List customers=new ArrayList<>();
		Iterator i=itr.iterator();
		while(i.hasNext()) {
			customers.add(i.next());
		}
		return customers;
	}
	
	@GetMapping("/getbyfname/{fname}")
	public List<Customer> getbyfname(@PathVariable("fname") String fname){
		return cusSer.findByFname(fname);
	}
	
	@GetMapping("/getbyfnameandlname/{fname}/{lname}")
	public List<Customer> getbyfnameandlname(@PathVariable("fname") String fname, @PathVariable("lname") String lname){
		return cusSer.getCustomerByFnameAndLname(fname, lname);
	}
	
	@PostMapping("/addcustomer")
	public String addCustomer(@RequestBody Customer c) {
		Customer cus=cusSer.save(c);
		return "Successfully Added!";
		
	}
	
//	@DeleteMapping("/deletecustomerbyId/{id}")
//	public String deletebyId(@PathVariable("id") int id) {
//		cusSer.deleteById(id);
//		return "Successfully Deleted!";
//	}
	
	@PutMapping("/update/{Address}/{Newaddress}")
	public String updateByaddress(@PathVariable("Address") String Address, @PathVariable("Newaddress") String Newaddress){
		cusSer.updateByAddress(Address, Newaddress);
		return "Successfully Updated!";
	}

}
