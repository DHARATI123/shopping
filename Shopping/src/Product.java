
public class Product {
		private int productId;
	    private String productName;
	    private double productPrice;
		private int productQuantity;
		public Product(int productId, String productName, double productPrice,int productQuantity) {
			
			this.productId = productId;
			this.productName = productName;
			this.productPrice = productPrice;
			this.productQuantity = productQuantity;
		}
		public int getProductId() {
			return productId;
		}
		public String getProductName() {
			return productName;
		
		}
		public double getProductPrice() {
			return productPrice;
		}
		public double getProductQuantity() {
			return productQuantity;
		}
	    
		
}
