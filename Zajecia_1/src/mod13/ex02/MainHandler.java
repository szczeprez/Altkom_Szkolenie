package mod13.ex02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

import java.util.Map.Entry;

public class MainHandler implements UserInterface {
	private TravelOffice to;
	private Scanner scanner = null;

	MainHandler(TravelOffice to) {
		this.to = to;
		scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
	}

	public Customer addCustomer() {
		String firstName, lastName, address;
		do {
			System.out.print("Enter first name: ");
			firstName = trim(scanner.next());
		} while (isEmpty(firstName));
		do {
			System.out.print("Enter last name: ");
			lastName = trim(scanner.next());
		} while (isEmpty(lastName));
		do {
			System.out.print("Enter address: ");
			address = trim(scanner.next());
		} while (isEmpty(address));
		String name = capitalize(firstName) + " " + capitalize(lastName);
		Customer customer = new Customer(name);
		customer.setAddress(address);
		to.addCustomer(customer);

		System.out.println("New customer was added");
		return customer;
	}

	public Trip addTrip() {
		Trip trip = null;
		System.out.print("Enter trip id: ");
		String name = scanner.next();
		System.out.print("Enter destination: ");
		String dest = scanner.next();
		System.out.print("Enter start date (dd-mm-yy): ");
		String start_date = scanner.next();
		System.out.println("Enter end date (dd-mm-yy): ");
		String end_date = scanner.next();

		SimpleDateFormat data = new SimpleDateFormat("dd-MM-yy");
		Date start = data.parse(start_date, new ParsePosition(0));
		if (start == null) {
			String message = "Wrong start date format";
			System.out.println(message);
			return null;
		}

		Date end = data.parse(end_date, new ParsePosition(0));
		if (end == null) {
			String message = "Wrong end date format";
			System.out.println(message);
			return null;
		}

		System.out.print("Enter price:");
		int price = scanner.nextInt();

		System.out.print("local/abroad (l/a) ");
		String type = scanner.next();
		if (type.equals("a")) {
			System.out.print("Enter insurance: ");
			int insurance = scanner.nextInt();
			trip = new AbroadTrip(start, end, dest);
			trip.setPrice(price);
			((AbroadTrip) trip).setInsurance(insurance);
			to.addTrip(name, trip);
		} else {
			System.out.print("Enter own arrival discount: ");
			int discount = scanner.nextInt();
			trip = new DomesticTrip(start, end, dest);
			trip.setPrice(price);
			((DomesticTrip) trip).setOwnArrivalDiscount(discount);
			to.addTrip(name, trip);
		}
		System.out.println("New trip was created");
		return trip;
	}

	public void assign() {

		System.out.print("Enter customer name: ");
		String name = scanner.next();
		System.out.print("Enter trip id: ");
		String id = scanner.next();

		Trip trip = to.getTrips().get(id);
		if (trip == null) {
			System.out.println("No trip under id '" + id + "'");
			return;
		}

		try {
			to.setCustomerTrip(name, trip);
		} catch (NoSuchCustomerException e) {
			System.out.println(e.getMessage());
			return;
		}

	}

	public boolean removeCustomer() {
		System.out.print("Enter name: ");
		String customerName = scanner.next();

		try {
			to.removeCustomer(customerName);
		} catch (NoSuchCustomerException e) {
			System.out.println(e.getMessage());
			return false;
		}

		System.out.println("Customer was removed");
		return true;
	}

	public boolean removeTrip() {
		System.out.print("Enter trip id: ");
		String id = scanner.next();
		try {
			to.removeTrip(id);
		} catch (NoSuchTripException e) {
			System.out.println(e.getMessage());
			return false;
		}
		System.out.println("Trip was removed");
		return true;
	}

	public void showTrips() {
		Map<String, Trip> t = to.getTrips();
		for (Entry<String, Trip> entry : t.entrySet())
			System.out.println(entry.getKey() + ": " + entry.getValue().getInfo());
	}

	public void showCustomers() {
		for (Customer c : to.getCustomers())
			System.out.println(c.getInfo());
	}

	public boolean saveTravelOffice() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("to.ser"));
			oos.writeObject(to);
			oos.close();
			System.out.println("Data was saved to disk successfully");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean loadTravelOffice() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("to.ser"));
			to = (TravelOffice) ois.readObject();
			ois.close();
			System.out.println("Data was read from disk successfully");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
