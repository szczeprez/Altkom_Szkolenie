package mod13.ex01;

import org.junit.Test;

public class AppTest2 {

	@Test(expected = ArithmeticException.class)
	public void divisionWithException(){
		System.out.println("divisionWithException");
		double i = 1 / 0; 
		System.out.println(i);
	}
}
