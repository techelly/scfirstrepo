package jdbcapp.mainapp;

import java.util.List;

import jdbcapp.model.Customer;
import jdbcapp.service.CustomerService;
import jdbcapp.service.CustomerServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		List<Customer> listOfCustomers=customerService.getAllCustomers();
		System.out.println(listOfCustomers);
		
		Customer customer = new Customer();
		customer.setCustomerId(5);
		customer.setMailId("akash@gmail.com");
		customer.setName("Kamal");
		customer.setAccount("current");
		customer.setContact("1115555555");
		
		String message = customerService.addCustomer(customer);
		System.out.println(message);
	}

}
