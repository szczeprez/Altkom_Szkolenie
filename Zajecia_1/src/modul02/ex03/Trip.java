package modul02.ex03;

public abstract class Trip {

	private Date start;
	private Date end;
	private String destinatnion;
	private int price;

	public Trip(Date start, Date end, String destinatnion) {
		super();
		this.start = start;
		this.end = end;
		this.destinatnion = destinatnion;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {

		return " from " + start.toString() + ", end " + end.toString()
				+ ", destinatnion " + destinatnion + " , price " + getPrice();
	}

}
