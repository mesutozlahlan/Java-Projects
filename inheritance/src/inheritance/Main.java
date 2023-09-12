package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer Mesut = new IndividualCustomer();
		Mesut.customerNumber = "12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "789910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "999999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {Mesut,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}
