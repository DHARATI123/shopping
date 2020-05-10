
public class Bill {
	private int billno;
	private double total;
	private double gst;
	private double finalamount;
		public Bill(int billno, double total, double gst, double finalamount) {
		super();
		this.billno = billno;
		this.total = total;
		this.gst = gst;
		this.finalamount = finalamount;
	}
		public int getBillno() {
			return billno;
		}
		//public void setBillno(int billno) {
			//this.billno = billno;
		//}
		public double getTotal() {
			return total;
		}
		//public void setTotal(double total) {
			//this.total = total;
		//}
		public double getGst() {
			return gst;
		}
	//	public void setGst(double gst) {
		//	this.gst = gst;
		//}
		public double getFinalamount() {
			return finalamount;
		}
		//public void setFinalamount(double finalamount) {
			//this.finalamount = finalamount;
		//}
		
	}

