package jdbcapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbcapp.model.Customer;
import jdbcapp.util.DBUtil;
import jdbcapp.util.QueryMapper;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public String addCustomer(Customer customer) {
		Connection conn = DBUtil.getDBConnection();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(QueryMapper.ADD_CUSTOMER);
			ps.setInt(1, customer.getCustomerId());
			ps.setString(2, customer.getName());
			ps.setString(3, customer.getMailId());
			ps.setString(4, customer.getContact());
			ps.setString(5, customer.getAccount());
			int row = ps.executeUpdate();
			if (row > 0) {
				return "New customer inserted into database";
			}
			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Unable to insert new customer into database";
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
		// Connection object
		Connection conn = DBUtil.getDBConnection();
		PreparedStatement pstmt;
		// JDBC statement
		try {
			pstmt = conn.prepareStatement(QueryMapper.DELETE_CUSTOMER);
			pstmt.setInt(1, customerId);
			int row = pstmt.executeUpdate();// return no of rows effected
			if (row > 0) {
				return "Deleted customer with customerId ---" + customerId + " successfully";
			}
			// Close the open connection,statement or resultset
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Return desired result
		return "Not able to find the customer with customer id --- " + customerId;
	}

	@Override
	public List<Customer> getAllCustomers() {
		Connection conn = DBUtil.getDBConnection();
		// Statement interface object is used here to execute static query
		Statement stmt;
		ResultSet rs;
		Customer customer;
		List<Customer> listOfCustomer = new ArrayList<Customer>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(QueryMapper.GET_ALL_CUSTOMERS);
			while (rs.next()) {
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
