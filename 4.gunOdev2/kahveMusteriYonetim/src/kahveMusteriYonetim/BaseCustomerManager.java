package kahveMusteriYonetim;

public class BaseCustomerManager implements CustomerService{

	public void save(Customer customer) {
		// veritabanina yazma kodlari
		System.out.println("Saved to db : "+ customer.firstName);
		
	}
}
