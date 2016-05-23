package modul02.ex03;

public class TravelOffice {
	
	private Customer[] customers = new Customer[2];
	private int customerCound;

	public void addCustomer(Customer c) {
		/*
		 * W przypadku przepe³nienia tablicy
		 */
		if (customers.length == customerCound) {
			Customer[] temp = new Customer[customerCound + 2];
			System.arraycopy(customers, 0, temp, 0, customerCound);
			customers = temp;
		}
		customers[customerCound++] = c;
	}

	public int getCustomerCount() {
		return customerCound;
	}

	public String getInfo() {
		String report = "";
		for (int i = 0; i < customerCound; i++) {
			report += customers[i].getInfo() + " \n";
		}
		return report;
	}

}
