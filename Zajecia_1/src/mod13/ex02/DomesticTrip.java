package mod13.ex02;

import java.util.Date;

public class DomesticTrip extends Trip {
	private static final long serialVersionUID = 1L;
	private int ownArrivalDiscount;

	public DomesticTrip(Date start, Date end, String destination) {
		super(start, end, destination);
	}

	public int getPrice() {
		return super.getPrice() - ownArrivalDiscount;
	}

	public void setOwnArrivalDiscount(int ownArrivalDiscount) {
		this.ownArrivalDiscount = ownArrivalDiscount;
	}
}
