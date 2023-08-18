package jdbcapp.service;

import java.util.List;

import jdbcapp.dao.CustomerDAO;
import jdbcapp.dao.CustomerDAOImpl;
import jdbcapp.model.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerDAO customerDAO = new CustomerDAOImpl();
	
	@Override
	public String addCustomer(Customer customer) {
		return customerDAO.addCustomer(customer);
	}

	@Override
	public Customer getCustomer(Integer customerId) {
		return customerDAO.getCustomer(customerId);
	}

	@Override
	public String updateCustomer(Customer customer) {
		
		return customerDAO.updateCustomer(customer);
	}

	@Override
	public String deleteCustomer(Integer customerId) {
		
		return customerDAO.deleteCustomer(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerDAO.getAllCustomers();
	}

}
