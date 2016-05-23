package mod07.ex02;

public class Test {
	public static void main(String[] args) {
		TravelOffice to = TravelOffice.getInstance();

		DomesticTrip dtrip = new DomesticTrip(new Date(2004, 8, 1), new Date(
				2004, 8, 14), "Jurata");
		dtrip.setPrice(800);
		dtrip.setOwnArrivalDiscount(100);
		to.addTrip("jur", dtrip); 

		AbroadTrip atrip = new AbroadTrip(new Date(2004, 8, 1), new Date(2004,
				8, 14), "Egipt");
		atrip.setPrice(1200);
		atrip.setInsurance(200);
		to.addTrip("egi", atrip); 

		Customer customer = new Customer("Jozef Nowak");
		customer.setAddress("Al. Jerozolimskie 120, Warszawa");
		customer.assignTrip(to.getTrips().get("jur"));
		to.addCustomer(customer);

		customer = new Customer("Jaroslaw Lis");
		customer.setAddress("Swietokrzyska 14, Warszawa");
		customer.assignTrip(to.getTrips().get("egi"));
		to.addCustomer(customer);

		//to.removeCustomer("Jaroslaw Lis"); 
		to.saveTripsToFile("trips.txt"); 
	    System.out.println(	to.readTripsFromFile("trip.txt")); 
		
		System.out.println(to.getInfo());

	}
}
