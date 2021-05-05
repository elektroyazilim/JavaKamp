package kahveMusteriYonetim;

public class Main {

	public static void main(String[] args) {
		
		//BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		//baseCustomerManager.save(new Customer(1,"Hakan","Yamuk","12345678994"));
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager.save(new Customer(1,"Ali","Veli","11111112221"));
		
	}

}
