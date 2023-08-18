package jdbcapp.util;

public interface QueryMapper {

	public static final String GET_ALL_CUSTOMERS = "select * from customer";
	public static final String ADD_CUSTOMER="insert into customer(customerId,name,mailId,contact,account) values (?,?,?,?,?);";
	public static final String DELETE_CUSTOMER="delete from customer where customerId=?;";
	
}
