package SOLIDPrinciples.DIP;

/*
class CreditCard{
	public void makePayment(double amount) {
		System.out.println("Payment of " + amount + " made with creditcard. ");
		
	}
}
class ShoppingCart{
	private CreditCard creditCard;
	
	public ShoppingCart(CreditCard creditCard){
		this.creditCard = creditCard;
	}
	
	public void checkout(double amount) {
		creditCard.makePayment(amount);
	}
}
public class Client {

	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard();
        ShoppingCart cart = new ShoppingCart(creditCard);
        cart.checkout(100.0);
		
	}
}
 */

interface PaymentMethod{
	void makePayment(double amount);
}

class CreditCard implements PaymentMethod{

	@Override
	public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made with Credit Card.");

	}
	
}

class PayPal implements PaymentMethod{

	@Override
	public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made with PayPal.");

	}
	
}

class ShoppingCart{
	private PaymentMethod paymentMethod;
	
	public ShoppingCart(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void checkout(double amount) {
		paymentMethod.makePayment(amount);
	}
}
public class Client {

	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard();
        ShoppingCart cart = new ShoppingCart(creditCard);
        cart.checkout(100.0);
		
        //using paypal method
        
        PaymentMethod payPal = new PayPal();
        ShoppingCart cart2 = new ShoppingCart(payPal);
        cart2.checkout(200.0);
	}

}

