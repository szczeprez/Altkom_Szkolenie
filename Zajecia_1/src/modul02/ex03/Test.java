package modul02.ex03;

public class Test {

	public static void main(String[] args) {
		TravelOffice travelOffice = new TravelOffice();
	
 	
		Customer klient = new Customer("Jan Kowalski");
		klient.setAddress("ul. Piotrkowska 105, £ódŸ");
	Trip atrip = new AbroadTrip(new Date(2016, 06, 01),new Date(2016, 06, 15), "Egipt");
	atrip.setPrice(1000); 
	((AbroadTrip) atrip).setInsurance(200); // rzutowanie w dó³

		klient.assingTrip(atrip);
		travelOffice.addCustomer(klient);
	
		klient = new Customer("Anna Kowalska");
		klient.setAddress("ul. Pi³sudskiego 22, £ódŸ");
	Trip dtrip = new DomesticTrip(new Date(2016, 06, 01),new Date(2016, 06, 15), "Bia³ka Tatrzañska");
	dtrip.setPrice(1000); 
	((DomesticTrip) dtrip).setOwnArrivalDiscount(200); // rzutowanie w dó³
		klient.assingTrip(dtrip);
		travelOffice.addCustomer(klient);
	
 
	
		System.out.println(travelOffice.getInfo());
	
	}

}
