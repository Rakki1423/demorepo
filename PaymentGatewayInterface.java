import java.util.*;
public class PaymentGatewayInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter amount :");
        double amount = sc.nextDouble();
	sc.close();

        PaymentGateway creditCard = new CreditCardPayment();
        PaymentGateway paypal = new PayPalPayment();

        creditCard.processPayment(amount);
        paypal.processPayment(amount);

        
    }
}

interface PaymentGateway {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of: $"+amount);
        System.out.println("Credit Card payment processed successfully!");
    }
}

class PayPalPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment of: $"+amount);
        System.out.println("Paypal payment processed successfully!");
    }
}


