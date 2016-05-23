package mod13.ex02.tests;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import mod13.ex02.AbroadTrip;
import mod13.ex02.DomesticTrip;
import mod13.ex02.NoSuchTripException;
import mod13.ex02.TravelOffice;

public class TripsTests {
	private static TravelOffice to;

	private static String atripId;
	private static AbroadTrip atrip;
	private static String dtripId;
	private static DomesticTrip dtrip;

	@BeforeClass
	public static void globalSetup() {
		final long ONE_DAY = TimeUnit.DAYS.toMillis(1);
		final Date TODAY = new Date();
		final Date TOMORROW = new Date(TODAY.getTime() + ONE_DAY);

		to = TravelOffice.getInstance();

		atripId = "abroad";
		atrip = new AbroadTrip(TODAY, TOMORROW, "Berlin");
		atrip.setPrice(2_000);
		atrip.setInsurance(100);

		dtripId = "domestic";
		dtrip = new DomesticTrip(TODAY, TOMORROW, "Gniezno");
		dtrip.setPrice(1_000);
		dtrip.setOwnArrivalDiscount(50);
	}

	@AfterClass
	public static void globalTearDown() {
		to = null;
	}

	@After
	public void tearDown() {
		to.getTrips().clear();
	}

	@Test
	public void testInitiallyThereAreNoTrips() {
		Assert.assertTrue("Trips set is initially empty", to.getTrips().isEmpty());
	}

	@Test
	public void testTripCanBeAdded() {
		to.addTrip(atripId, atrip);
		to.addTrip(dtripId, dtrip);
		Assert.assertTrue("Abroad trip was added", to.getTrips().containsKey(atripId));
		Assert.assertTrue("Domestic trip was added", to.getTrips().containsKey(dtripId));
	}

	@Test
	public void testExistingTripCanBeRemoved() throws NoSuchTripException {
		to.addTrip(atripId, atrip);
		to.removeTrip(atripId);
		Assert.assertFalse("Trip was removed", to.getTrips().containsKey(atripId));
	}

	@Test(expected = NoSuchTripException.class)
	public void testNotFoundTripCannotBeRemoved() throws NoSuchTripException {
		to.addTrip(atripId, atrip);
		to.removeTrip(dtripId);
	}
}
