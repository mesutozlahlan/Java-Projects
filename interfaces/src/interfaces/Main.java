package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer mesut = new Customer(1,"Mesut","Ozlahlan");
		
		customerManager.add(mesut);

	}

}
