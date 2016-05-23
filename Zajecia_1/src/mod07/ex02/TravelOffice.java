package mod07.ex02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TravelOffice {
	/**
	 * Jest utworzony singleton !!!
	 * Provate construktor i statyczna metoda getInstance(); 
	 */
	private static TravelOffice instance = new TravelOffice();

	private TravelOffice() {
	}

	public static TravelOffice getInstance() {
		return instance;
	}
	
	/**
	 * Zamiana tablicy na kolekcjê;
	 */
	// Deprecated
	//int customerCount = 0;

	// Deprecated
	//private Customer customers[] = new Customer[2];
	private Set<Customer> customers = new HashSet<>(); 
	private Map<String, Trip> trips = new HashMap<>(); 
	
	public void addTrip(String id, Trip trip){
		trips.put(id, trip); 
	}
	
	public void removeTrip(String id){
		trips.remove(id); 
	}
	
	public Set<Customer> getCustomers() {
		return customers;
	}

	public Map<String, Trip> getTrips() {
		return trips;
	}

	public void removeCustomer(String name) {
		for(Customer c: customers){
		 
			if(c.getInfo().startsWith("Name: " + name + "\n")){
				System.out.println("name =" + name);
				 customers.remove(c); 
				 break; 
			}
 
		}
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer); 
	}

	
/* Deprecated
 * 	public void addCustomer(Customer customer) {
		if (customerCount == customers.length) {
			Customer temp[] = new Customer[customers.length + 2];
			System.arraycopy(customers, 0, temp, 0, customers.length);
			customers = temp;
		}
		customers[customerCount++] = customer;
	}*/

	public int getCustomerCount() {
		return customers.size();
	}
	public String getInfo() {
		String report = " "; 
		for(Customer c : customers){
			report += c.getInfo() + " \n"; 
		}
		return report; 
	}
	
	// Deprecated
/*	public String getInfo() {
		String report = "";
		for (int i = 0; i < customerCount; i++) {
			report += customers[i].getInfo() + "\n";
		}
		return report;
	}*/
	
	/*
	 * Rozwi¹zanie z java 1.6
	 */
	/*public void saveTripsToFile(String fileName){
		File file  = new File(fileName); 
		FileWriter out = null; 
		try {
			out = new FileWriter(file);
			String separator = System.getProperty("line.separator");
			for (Map.Entry<String, Trip> entry: trips.entrySet()) {
				out.write(entry.getKey() + ": " + entry.getValue().getInfo() + separator ); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}*/
	/**
	 * Java 1.7
	 * @param fileName
	 */
	public void saveTripsToFile(String fileName){
		File file  = new File(fileName); 
		//autodomkniêcie strumienia out.close() poniewa¿ implementuje interface AutoClosable
		try(FileWriter out = new FileWriter(file)) {
			String separator = System.getProperty("line.separator");
			for (Map.Entry<String, Trip> entry: trips.entrySet()) {
				out.write(entry.getKey() + ": " + entry.getValue().getInfo() + separator ); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * Rozwi¹zanie z java 1.6
	 */
/*	public String readTripsFromFile(String fileName){
		File file = new File(fileName); 
		if(!file.exists()){
			return ""; 
		}
		FileReader in = null; 
 
		try {
			in = new FileReader(file);
		    char[] buffer = new char[(int) file.length()]; 
		    in.read(buffer); 
		    return new String(buffer); 
		    
		} catch (IOException e) {
			e.printStackTrace();
			return ""; 
		} finally{
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
		}
		
	}*/
	
	/**
	 * Java 7
	 */
	public String readTripsFromFile(String fileName){
		File file = new File(fileName); 
		if(!file.exists()){
			return ""; 
		}
		//Autodomkniêcie strumienia
		try(FileReader in = new FileReader(file)) {
		    char[] buffer = new char[(int) file.length()]; 
		    in.read(buffer); 
		    return new String(buffer); 
		    
		} catch (IOException e) {
			e.printStackTrace();
			return ""; 
		} 		
	}
}
