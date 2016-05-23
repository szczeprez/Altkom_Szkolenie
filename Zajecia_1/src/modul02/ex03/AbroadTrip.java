package modul02.ex03;

public class AbroadTrip extends Trip {
	private int insurance;

	public AbroadTrip(Date start, Date end, String destinatnion) {
		super(start, end, destinatnion);
	}

	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}

	@Override
	public int getPrice() {
		return super.getPrice() + insurance;
	}
	
}
