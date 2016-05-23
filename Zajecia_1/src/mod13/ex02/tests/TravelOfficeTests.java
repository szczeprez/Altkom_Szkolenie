package mod13.ex02.tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import mod13.ex02.TravelOffice;

public class TravelOfficeTests {
	private static TravelOffice to;

	@BeforeClass
	public static void globalSetup() {
		to = TravelOffice.getInstance();
	}

	@AfterClass
	public static void globalTearDown() {
		to = null;
	}

	@Test
	public void testTravelOfficeIsInstantiated() {
		Assert.assertNotNull("TravelOffice instance not null", to);
	}

	@Test
	public void testTravelOfficeIsSingleton() {
		TravelOffice to2 = TravelOffice.getInstance();
		Assert.assertSame("Both references point the same TravelOffice object", to, to2);
	}

	@Test
	public void testCustomersSetIsInstantiated() {
		Assert.assertNotNull("Customers set instance not null", to.getCustomers());
	}

	@Test
	public void testTripsSetIsInstantiated() {
		Assert.assertNotNull("Trips set instance not null", to.getTrips());
	}

}