package jdbcapp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbcapp.model.Customer;
import jdbcapp.util.DBUtil;
import jdbcapp.util.QueryMapper;

public class CustomerDAOImpl implements CustomerDAO{

	@Override
	public String addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		Connection conn = DBUtil.getDBConnection();
		// Statement interface object is used here to execute static query
		Statement stmt;
		ResultSet rs;
		Customer customer;
		List<Customer> listOfCustomer= new ArrayList<Customer>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(QueryMapper.GET_ALL_CUSTOMERS);
			while(rs.next()) {
				customer = new Customer();
				customer.setCustomerId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setMailId(rs.getString(3));
				customer.setContact(rs.getString(4));
				customer.setAccount(rs.getString(5));
				listOfCustomer.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listOfCustomer;
	}

}
