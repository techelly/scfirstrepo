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
	}

}
