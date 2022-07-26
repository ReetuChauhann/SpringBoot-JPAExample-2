package com.reetu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.reetu.beans.Customer;




public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	 
     public List<Customer> findByFnameStartingWith(String keyword);
     public List<Customer> findByFnameEndingWith(String keyword);
     public List<Customer> findByFnameContaining(String keyword);
     public List<Customer> findByFnameLike(String pattern);
     public List<Customer> findByAddress(String add);
     public List<Customer> findByLname(String keyword);
     public List<Customer> findByLnameStartingWith(String keyword);
     public List<Customer> findByIdIn(List<Integer> ids);
     public List<Customer> findByFname(String fname);
     
     
     @Query("Select c FROM Customer c") 
     public List<Customer> getAllEmployee();
     
     @Query("Select c From Customer c WHERE c.fname=:n")
     public List<Customer> getCustomerByFname(@Param("n") String depart);
     
       @Query("Select c From Customer c WHERE c.fname=:n and c.lname=:s")
       public List<Customer> getCustomerByFnameAndLname(@Param("n") String fname,@Param("s") String lname);
     
     //Native Query
     @Query(value="select * from customer",nativeQuery=true)
     public List<Customer> getCustomer();
     
     @Modifying
     @Query("update Customer e set e.address=:a2 where e.address=:a")
     public void updateByAddress(@Param("a") String address, @Param("a2") String Newaddress);
}
