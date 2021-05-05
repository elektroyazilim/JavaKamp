package kahveMusteriYonetim;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;
	
	//constructor
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.setCustomerCheckService(customerCheckService);
	}
	// getter & setters
	public CustomerCheckService getCustomerCheckService() {
		return customerCheckService;
	}

	public void setCustomerCheckService(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer) {
		// !!!!
		if (customerCheckService.checkIfRealPerson(customer)) {
			// veritabanina yazma kodlari
			System.out.println("Saved to db : "+ customer.firstName);
		}
		else {
			System.out.println("Invalid person");
		}

		
	}
}
