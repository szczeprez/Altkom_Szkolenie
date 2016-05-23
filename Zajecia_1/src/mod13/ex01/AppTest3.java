package mod13.ex01;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

public class AppTest3 {

	@Ignore("not ready yet!")
	@Test(expected = ArithmeticException.class)
	public void divisionWithException(){
		System.out.println("divisionWithException AppTest3");
		double i = 1 / 1; 
		System.out.println(i);
	}
	/**
	 * Porówanie NaN z czymkolwiek zawsze daje 'false' <br>
	 * double d1 = Double.NaN<br>
	 * double d2 = d1; <br>
	 * system.out.println(d1 == d2 ) 	=> false<br>
	 * ---sprawdzamy---<br>
	 * Double.isNaN(d2); <br>
	 */
	@Test
	public void divisionWithoutException(){
		double i = 0.0 / 0; // Oczekiwana NaN
		Assert.assertTrue(Double.isNaN(i)); 
		System.out.println("divisionWithoutException NaN");
	}
}
