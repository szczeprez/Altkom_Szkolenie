package modul02.ex03;

public class Customer {
	
	private String name; 
	private String address; 
	private Trip trip;
	
	public Customer(String name) {
		this.name = name; 
	}

	public void setAddress(String address) {
		this.address = address;
	}

 	public void assingTrip(Trip trip) {
		this.trip = trip;
	}

	public String getInfo() {
		return  name + ",\n Address=" + address + ", Trip="
				+ trip.getInfo() ;
	}
 
	


}
