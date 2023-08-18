package jdbcapp.dao;

import java.util.List;

import jdbcapp.model.Customer;

public interface CustomerDAO {
		
	//Create
	public String addCustomer(Customer customer);
	//Retrieve
	public Customer getCustomer(Integer customerId);
	//Update
	public String updateCustomer(Customer customer);
	//Delete
	public String deleteCustomer(Integer customerId);
	
	//Retrieve all customers
	public List<Customer> getAllCustomers();
	
}
