import java.util.*;
public class PaymentMain {

	public static void main(String[] args) {
		Payment credit=new CreditCardPayment(1400.0);
		credit.processPayment();
		System.out.println("==================================");
		
		Payment upi=new UPIPayment(23000.14);
		upi.processPayment();
		System.out.println("==================================");
		
		Payment net=new NetBankingPayment(1423.1423);
		net.processPayment();
		System.out.println("==================================");
	}

}

abstract class Payment {
	double amount;
	public Payment(double amount) {
		super();
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	abstract void processPayment();
}

class CreditCardPayment extends Payment {
	
	public CreditCardPayment(double amount) {
		super(amount);
	}

	@Override
	void processPayment() {
		System.out.println("Processing Credit Card Payment...");
		System.out.println("Transaction Successful, Amount: "+getAmount());
	}
}

class UPIPayment extends Payment{

	public UPIPayment(double amount) {
		super(amount);
	}

	@Override
	void processPayment() {
		System.out.println("Processing UPI Payment...");
		System.out.println("Transaction Successful, Amount: "+getAmount());
	}

}
class NetBankingPayment extends Payment{

	public NetBankingPayment(double amount) {
		super(amount);
	}

	@Override
	void processPayment() {
		System.out.println("Processing Net Banking Payment...");
		System.out.println("Transaction Successful, Amount: "+getAmount());
	}

}



