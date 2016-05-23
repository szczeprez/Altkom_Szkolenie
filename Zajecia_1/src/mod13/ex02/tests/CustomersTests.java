package mod13.ex02.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import mod13.ex02.Customer;
import mod13.ex02.NoSuchCustomerException;
import mod13.ex02.TravelOffice;

public class CustomersTests {
	private static TravelOffice to;

	private static String customerName;
	private static Customer customer;

	@BeforeClass
	public static void globalSetup() {
		to = TravelOffice.getInstance();

		customerName = "Jan Kowalski";
		customer = new Customer(customerName);
	}

	@AfterClass
	public static void globalTearDown() {
		to = null;
	}

	@After
	public void tearDown() {
		to.getCustomers().clear();
	}

	@Test
	public void testInitiallyThereAreNoCustomers() {
		Assert.assertTrue("Customers set is initially empty", to.getCustomers().isEmpty());
	}

	@Test
	public void testCustomerCanBeAdded() {
		to.addCustomer(customer);
		Assert.assertTrue("Customer was added", to.getCustomers().contains(customer));
	}

	@Test
	public void testExistingCustomerCanBeRemoved() throws NoSuchCustomerException {
		to.addCustomer(customer);
		to.removeCustomer(customerName);
		Assert.assertFalse("Customer was removed", to.getCustomers().contains(customer));
	}

	@Test(expected = NoSuchCustomerException.class)
	public void testNotFoundCustomerCannotBeRemoved() throws NoSuchCustomerException {
		to.removeCustomer(customerName);
	}

}
