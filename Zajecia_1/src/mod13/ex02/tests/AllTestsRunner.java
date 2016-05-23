package mod13.ex02.tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CustomersTests.class, TripsTests.class, TravelOfficeTests.class })
public class AllTestsRunner {
	
	public static void main(String[] args) {
		JUnitCore.main(AllTestsRunner.class.getName());
	}
}