package SOLIDPrinciples.OCP;

/*
public class DiscountCalculator {
     public double calculateDiscount(String customerType, double amount) {
    	 if(customerType == "Regular") {
    		 return amount * 1.0;
    	 }else if (customerType == "Primium") {
    		 return amount * 0.2;
    	 }
    	 
    	 return 0;
     }
}
*/
abstract class Discount{
	public abstract double applyDiscount(double amount);
}

class RegularCustomerDiscount extends Discount{
	 public double applyDiscount(double amount) {
		 return amount * 0.1;
	 }
}

class PremiumCustomerDiscount extends Discount{
	public double applyDiscount(double amount) {
		return amount * 0.2;
	}
}
public class DiscountCalculator{
	public double calculateDiscount(Discount discount, double amount) {
		return discount.applyDiscount(amount);
	}
}
