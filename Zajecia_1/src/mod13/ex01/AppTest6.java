package mod13.ex01;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AppTest6 {
	private int checkYear; 
	private boolean expectedValue; 
	
	
	public AppTest6(int checkYear, boolean expectedValue) {
		this.checkYear = checkYear;
		this.expectedValue = expectedValue;
	}
	
	@Parameters
	public static Collection<Object[]> testedDateSetup(){
		Object[][] data = new Object[][]{
				{2016, true},
				{2017, false},
				{1900, false}
		}; 
		return Arrays.asList(data); 
	}
	
	@Test
	public void testYear(){ 
		System.out.println("Checking year: " + checkYear);
		Assert.assertEquals(expectedValue, isLeapYear(checkYear)); 
	}

	/**
	 * Metoda sprawdza czy rok jest przestêpny.
	 * 
	 * @param year
	 * @return true/false
	 */
	public boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		}
		if (year % 100 == 0) {
			return false;
		}
		return year % 4 == 0;
	}
	
}
