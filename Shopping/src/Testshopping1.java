
public class Testshopping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       customer1 c1=acceptData();
       displayData(c1);
       
	}

	private static void displayData(customer1 c1) {
		System.out.println("Customer Id : "+c1.getCustomerId());
		System.out.println("Customer Name : "+c1.getCustomerName());
		//sSystem.out.println("Customer EmailId"+c1.getEmailId());
		// TODO Auto-generated method stub
	System.out.println("Product Id : "+c1.getP1().getProductId());
	System.out.println("Product Name : "+c1.getP1().getProductName());
	System.out.println("Product Price : "+c1.getP1().getProductPrice());
	System.out.println("Product Quantity : "+c1.getP1().getProductQuantity());
	System.out.println("City name : "+c1.getA1().getCityname());
	System.out.println("Pincode : "+c1.getA1().getPincode());
	System.out.println("district : "+c1.getA1().getDist());
	System.out.println("Mobile No : "+c1.getA1().getCont().getMobileNo());
	System.out.println("Email Id : "+c1.getA1().getCont().getEmailId());

	}

	private static customer1 acceptData() {
		// TODO Auto-generated method stub
		Product p1=new Product(11,"laptop",10000,1);
		Contact cont=new Contact("12345678","abc@gmail.com");
		Address a1=new Address("alibag",402201,"raigad",cont);
		customer1 c1=new customer1(2,"ramesh",p1,a1);
		return c1;
	}
	

}
