package mod09.ex01;

import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
/**
 * @author Altkom
 * Zosta³a usuniêta klasa Date i zast¹piona klas¹ java.Data
 *
 */
public class Test {
	
	private static void setUp(){
		/**
		 * Logger defaltowy loguje na konsole dlatego jest potrzebna do niego referencja. 
		 */
		Logger root = Logger.getLogger(""); 
		for(Handler handler: root.getHandlers()){
			 root.removeHandler(handler); 
		}
		/*
		 * Jeœli mamy jeden Handler do usuniêcia to wybieramy pierwszy element z tablicy Handlerów.
		 */
		//root.removeHandler(root.getHandlers()[0]);
		
		/*
		 * Plik konfiguracyjny do Loggera: 
		 * C:\Program Files\Java\jdk1.8.0_91\jre\lib\logger.properties
		 */
		
		Logger logger = Logger.getLogger("mod09.ex01"); 
		logger.setLevel(Level.INFO);  	
		try {
			
			FileHandler fh = new FileHandler("log.txt");
			fh.setFormatter(new XMLFormatter()); 
//			fh.setFormatter(new SimpleFormatter()); 
 			logger.addHandler(fh); 
			
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		setUp(); 
		// utworz biuro podrozy
		TravelOffice to = TravelOffice.getInstance();
		MainHandler mh = new MainHandler(to);

		Scanner scan = new Scanner(System.in);
		top:
		while(true) {
			System.out.println("Options:\n1 - Add Customer");
			System.out.print("2 - Add trip\n");
			System.out.print("3 - Assign trip to customer\n");
			System.out.print("4 - Remove Customer\n");
			System.out.print("5 - Remove Trip\n");
			System.out.print("6 - Show Customers\n");
			System.out.print("7 - Show Trips\n");
			System.out.print("8 - Load\n");
			System.out.print("9 - Save\n");
			System.out.print("0 - Exit\n");
			int choice = scan.nextInt();
			switch (choice) {
			case 1: mh.addCustomer(); 
				break;
			case 2: mh.addTrip(); 
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6: mh.showCustomers(); 
				break;
			case 7: mh.showTrips(); 
				break;
			case 8: mh.loadTravelOffice(); 
				break;
			case 9: mh.saveTravelOffice(); 
				break;
			case 0:
				break top;
			default:
				break;
			}
		}
		scan.close();
	}
}
