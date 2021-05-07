package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		CorporateCustomer demirog = new CorporateCustomer();
		SyndicateCustomer sefa = new SyndicateCustomer();
		
		
		engin.customerNumber = "12345";
		demirog.customerNumber = "78910";
		sefa.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer [] customers = {engin, demirog, sefa};
		
		customerManager.addMultiple(customers);

		

	}
}