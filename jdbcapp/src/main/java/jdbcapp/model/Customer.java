package jdbcapp.model;

//Blueprint of customer object
public class Customer {
	//fields or properties
	private int customerId;
	private String name;
	private String mailId;
	private String contact;
	private String account;
	
	/**
	 * Using new keyword and calling constructor
	 * we create an object of a class 
	 */
	//No argument constructor
	public Customer() {

	}

	//Parameterized Constructor
	public Customer(int customerId, String name, String mailId, String contact, String account) {
		this.customerId = customerId;
		this.name = name;
		this.mailId = mailId;
		this.contact = contact;
		this.account = account;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", mailId=" + mailId + ", contact=" + contact
				+ ", account=" + account + "]";
	}
	
}
