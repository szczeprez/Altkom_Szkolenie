package mod09.ex01;

import java.io.Serializable;

public class Customer implements Serializable{
	private static final long serialVersionUID = 5863548763888346382L;
	
	private String name;
	private String address;
	private Trip trip;

	public Customer(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void assignTrip(Trip trip) {
		this.trip = trip;
	}

	public String getInfo() {
		if (null != trip) {
			
			return "Name: " + name + "\nAddress: " + address
					+ "\nHas a following trip: " + trip.getInfo() + "\n";
		} else {
			return "Name: " + name + "\nAddress: " + address + "\n";
		}
	}
}
