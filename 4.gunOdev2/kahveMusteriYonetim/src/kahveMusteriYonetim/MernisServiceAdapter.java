package kahveMusteriYonetim;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// Mernis sistem client kodlar�
		return true;
	}

}
