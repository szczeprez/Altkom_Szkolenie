package modul02.ex03;

public class DomesticTrip extends Trip {

	private int ownArrivalDiscount;

	public DomesticTrip(Date start, Date end, String destinatnion) {
		super(start, end, destinatnion);
	}

	public void setOwnArrivalDiscount(int ownArrivalDiscount) {
		this.ownArrivalDiscount = ownArrivalDiscount;
	}

	@Override
	public int getPrice() {
		return super.getPrice() - ownArrivalDiscount;
	}
}
