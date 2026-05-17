package java_interview_scenarios;



abstract class AbsPayment {

	private String customerName;
	private String paymentId;
	private static int rnum = 701;

	AbsPayment(String customerName) {

		this.paymentId = "XYZ100" + rnum++;
		this.customerName = customerName;

	}

	public String getCustomerName() {
		return customerName;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void paymentDetails() {
		System.out.println("Thank you  : " + customerName);
		System.out.println("Payment ID : " + paymentId);
	}

	abstract void pay(double amount);
}

class Gpay extends AbsPayment {

	Gpay(String customerName) {
		super(customerName);
	}

	@Override
	void pay(double amount) {
		System.out.println(" ---  Gpay Payment --- ");
		System.out.println("Thank you " + getCustomerName());
		System.out.println(" Payment Successfully Rs : " + amount);
	}

}

class Cardpay extends AbsPayment {

	Cardpay(String customerName) {
		super(customerName);

	}

	@Override
	void pay(double amount) {
		System.out.println(" ---  Gpay Payment --- ");
		System.out.println("Thank you " + getCustomerName());
		System.out.println("Payment Successfully Rs : " + amount);

	}
}

public class Abstraction_Ex1 {
	public static void main(String[] args) {

		AbsPayment user1 = new Gpay("Harivansh");
		user1.pay(55000);
		AbsPayment user2 = new Cardpay("Shivam");
		user2.pay(2500);

	}
}
