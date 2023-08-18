package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbcapp.model.Customer;

public class JDBCDemo {

	private final static String url = "jdbc:postgresql://localhost:5432/scbdb";
	private final static String username = "postgres";
	private final static String password = "password";

	public static void main(String[] args) {
		
	
		Customer customer;
		List<Customer> listOfCustomer = new ArrayList<Customer>();
		try {
			// Connection object using postgresql
			Connection conn = DriverManager.getConnection(url, username, password);
			String customerSql = "select * from customer";
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(customerSql);
			while(rs.next()) {
				//System.out.println(rs.getInt(0));
				customer = new Customer();
				customer.setCustomerId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setMailId(rs.getString(3));
				customer.setContact(rs.getString(4));
				customer.setAccount(rs.getString(5));
				listOfCustomer.add(customer);
			
			}
			System.out.println(listOfCustomer);
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
