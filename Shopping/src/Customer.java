
public class Customer {
	private int customerId;
	private String customerName;
	private Product []arr;
	private Bill b1;
	public Customer(int customerId, String customerName, Product[] p1) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.arr=p1;
		this.b1=b1;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public Product[] getP1() {
		return arr;
	}
	public Bill getB1(){
		return b1;
	}
	public void setB1(Bill b1){
		this.b1=b1;
	}
	}
