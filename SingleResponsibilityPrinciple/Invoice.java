package SOLIDPrinciples.SingleResponsibilityPrinciple;

/*
//without using SRP
public class Invoice {
      private int InvoiceId;
      private double amount;
      
      
      public void calculateTotal() {
    	  System.out.println("Total amount is : " + amount);
      }
      
      public void printInvoice() {
    	  System.out.println("Invoice ID : " + InvoiceId);
      }
      
      public void  saveToDatabase() {
    	  System.out.println("Amount : " + amount + "\n" + " Invoice Id : " + InvoiceId );
      }
      
}
*/

//with SRP

public class Invoice{
	private int InvoiceId;
	private int amount;
	
	public void calculateTotal() {
		
	}
}

class InvoicePrinter{
	
	public void printInvoice(Invoice invoice) {
		
	}
}

class InvoiceRepository{
	public void saveToDatabase(Invoice invoice) {
		
	}
}
