
public class customer1 {
	
	private int customerId;
	private String customerName;
	
	private Product p1;
	private Address a1;
	public customer1(int customerId, String customerName, Product p1, Address a1) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;

	
		this.p1 = p1;
		this.a1 = a1;
	}
	public int getCustomerId() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public Product getP1() {
		return p1;
	}
	public Address getA1() {
		return a1;
	}
	

		


}
