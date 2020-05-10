
public class TestShopping {
	public static void main(String[] args) {
		Customer cust=accept();
		cust=calculate(cust);
		display(cust);
	}


		public static Customer calculate(Customer cust){
		  Product arr[]=cust.getP1();
		  double total=0,gst,finaltotal;
		  for(Product p1:arr){
			  total=total+p1.getProductPrice()*p1.getProductQuantity();
		  }
		 gst=total*0.12;
	     finaltotal=gst+total;
		Bill b1=new Bill(1001,total,gst,finaltotal);
		cust.setB1(b1);
		return cust;
	
		}	
		public static Customer accept(){
			// TODO Auto-generated method stub
			Product p1=new Product(101,"pd",4000,2);
			Product p2=new Product(102,"laptop",35000,1);
			Product arr[]=new Product[2];
			arr[0]=p1;
			arr[1]=p2;
			Customer cust=new Customer(12,"pqr",arr);
            return cust;
		}


	public static void display(Customer cust){
		System.out.println("*****customer details*************");
		System.out.println("CustId :"+cust.getCustomerId());
		System.out.println("custName :"+cust.getCustomerName());
		Product arr[]=cust.getP1();
		for(Product p1:arr){
			System.out.println("..............product details...................");
			System.out.println("product Id :"+p1.getProductId());
			System.out.println("product Name :"+p1.getProductName());
			System.out.println("product quantity :"+p1.getProductQuantity());
			System.out.println("product price:"+p1.getProductPrice());
			
		}System.out.println("...............thanku..............");
		System.out.println("............bill....................");
		System.out.println("bill no."+cust.getB1().getBillno());
		System.out.println("Total:"+cust.getB1().getTotal());
		System.out.println("GST:"+cust.getB1().getGst());
		System.out.println("Final Total"+cust.getB1().getFinalamount());
	    System.out.println("................thankuuu visit again................");
		
	}

}


