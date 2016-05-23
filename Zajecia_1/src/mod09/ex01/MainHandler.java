package mod09.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class MainHandler implements UserInterface {

	private TravelOffice to;
	private Scanner scanner;
	private static Logger logger = Logger.getLogger("mod09.ex01") ;

	public MainHandler(TravelOffice to) {
		this.to = to;
		scanner = new Scanner(System.in);
		scanner.useDelimiter("\r\n");
	}

	@Override
	public Customer addCustomer() {
		System.out.println("Podaj imie: ");
		String firstName = scanner.next();
		System.out.println("Podaj nazwisko: ");
		String lastName = scanner.next();
		System.out.println("Podaj adres: ");
		String address = scanner.next();

		Customer klient = new Customer(firstName + " " + lastName);
		klient.setAddress(address);
		to.addCustomer(klient);
		System.out.println("Dodano nowego klienta ...");
		logger.info("Do biura podó¿y dodano nowego klienta: " + klient.getInfo() + " \n"); 
		return klient;
	}

	@Override
	public Trip addTrip() {
		System.out.println("Podaj id wycieczki: ");
		String id = scanner.next();
		System.out.println("Podaj cel wycieczki: ");
		String destination = scanner.next();
		System.out.println("Podaj datê wycieczki(rrrr-mm-dd): ");
		String wyjazd = scanner.next();

		System.out.println("Podaj datê powrotu(rrrr-mm-dd): ");
		String data = scanner.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		// ParsePosition pp = new ParsePosition(0);

		Date dataWyjazdu = sdf.parse(wyjazd, new ParsePosition(0));
		Date dataPowrotu = sdf.parse(data, new ParsePosition(0));

		System.out.println("Podaj cenê wycieczki: ");
		int price = scanner.nextInt();
		Trip trip = null;
		boolean ok = false;
		do {
			System.out.println("Podaj tym wycieczki (k/z): ");
			String type = scanner.next();

			if ("z".equalsIgnoreCase(type)) {
				ok = true;
				System.out.println("Podaj koszt ubezpieczenia: ");
				int insurance = scanner.nextInt();
				trip = new AbroadTrip(dataWyjazdu, dataPowrotu, destination);
				// rzutowanie w dó³
				((AbroadTrip) trip).setInsurance(insurance);

			} else if ("k".equalsIgnoreCase(type)) {
				ok = true;
				System.out.println("Podaj rabat: ");
				int discount = scanner.nextInt();
				trip = new DomesticTrip(dataWyjazdu, dataPowrotu, destination);
				// rzutowanie w dó³
				((DomesticTrip) trip).setOwnArrivalDiscount(discount);
			} else {
				ok = false;
				System.out
						.println("Wybie¿ wycieczkê Krajowa lub Zagraniczn¹ (k/z)");
			}
		} while (!ok);

		trip.setPrice(price);
		to.addTrip(id, trip);
		System.out.println("Dodano now¹ wycieczkê. ..");
		return trip;
	}

	@Override
	public void assign() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean removeCustomer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeTrip() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void showTrips() {
		for (Map.Entry<String, Trip> entry : to.getTrips().entrySet()) {
			System.out.println(entry.getKey() + ": "
					+ entry.getValue().getInfo());
		}
	}

	@Override
	public void showCustomers() {
		System.out.println(to.getInfo() + " \n");
	}

	@Override
	public boolean saveTravelOffice() {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("to.ser"))) {
			out.writeObject(to) ;
			System.out.println("Zapisano dane do biura podró¿y");
			return true; 
			
		} catch (IOException e) {
			System.err.println("Zapisanie danych biura podró¿y nie powiod³o siê ...");
			System.err.println("Wyst¹pi³ wyj¹tek: " + e.getClass().getName());
			return false;
		}


	}

	@Override
	public boolean loadTravelOffice() {
		try(ObjectInputStream in = new ObjectInputStream((new FileInputStream("to.ser")))) {
			to = (TravelOffice) in.readObject(); 
			System.out.println("Odczyt wykonany poprawnie.");
			return true; 
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Odczytiwanie danych biura podró¿y nie powiod³o siê ...");
			System.err.println("Wyst¹pi³ wyj¹tek: " + e.getClass().getName());
			System.err.println("-------------------------------");
			e.printStackTrace();
			return false;
		} 

	}

}
