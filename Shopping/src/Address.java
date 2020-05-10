
public class Address {
	private String cityname;
	private int pincode;
	private String dist;
	private Contact cont; 
	public Address(String cityname, int pincode, String dist,Contact cont) {
		super();
		this.cityname = cityname;
		this.pincode = pincode;
		this.dist = dist;
		this.cont= cont;
	}
	public String getCityname() {
		return cityname;
	}
	public int getPincode() {
		return pincode;
	}
	public String getDist() {
		return dist;
	}
	public Contact getCont() {
		return cont;
	}
	
}

