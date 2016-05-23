package mod13.ex02;

public interface UserInterface {
	Customer addCustomer();
	Trip addTrip();
	void assign();
	boolean removeCustomer();
	boolean removeTrip();
	void showTrips();
	void showCustomers();
	boolean saveTravelOffice();
	boolean loadTravelOffice();
}
