package kahveMusteriYonetim;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		//dogrulama kodlari (fake)
		return true;
	}


}
