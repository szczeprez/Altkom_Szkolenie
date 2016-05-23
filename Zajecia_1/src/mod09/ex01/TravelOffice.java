package mod09.ex01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class TravelOffice implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2471358427631815432L;
	
	private static TravelOffice instance = new TravelOffice();

	private TravelOffice() {
	}

	public static TravelOffice getInstance() {
		return instance;
	}

	private Set<Customer> customers = new HashSet<Customer>();
	private Map<String, Trip> trips = new HashMap<String, Trip>();

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void addTrip(String name, Trip trip) {
		trips.put(name, trip);
	}

	public void removeCustomer(String name) {
		for (Customer c : customers) {
			if (c.getInfo().startsWith("Name: " + name)) {
				customers.remove(c);
				break;
			}
		}
	}

	public void removeTrip(String name) {
		trips.remove(name);
	}

	public int getCustomerCount() {
		return customers.size();
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public Map<String, Trip> getTrips() {
		return trips;
	}

	public String getInfo() {
		String report = "";
		for (Customer c : customers) {
			report += c.getInfo() + "\n";
		}

		return report;
	}

	public void saveTripsToFile(String filename) throws IOException {
		File file = new File(filename);
		String separator = System.getProperty("line.separator");
		try (FileWriter out = new FileWriter(file)) {
			out.write("Trips: " + separator);
			for (Trip trip : trips.values()) {
				out.write(trip.getInfo() + separator);
			}
		}
	}

	public String readTripsFromFile(String filename) throws IOException {
		File file = new File(filename);
		try (FileReader in = new FileReader(file)) {
			char[] buffer = new char[(int) file.length()];
			in.read(buffer);
			String contents = new String(buffer);
			return contents;
		}
	}
}