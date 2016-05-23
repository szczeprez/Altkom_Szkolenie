package mod13.ex01;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AppTest4 {

	@Rule
	public Timeout globalTimeout = new Timeout(1001);  
	 
	@Test
	public void longRunningMethod(){
		System.out.println("method started");
		
		try {
			Thread.sleep(TimeUnit.SECONDS.toMillis(1));
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("method finished");
	}
	
	@Test
	public void neverEndingMethod(){
		System.out.println("method started");
		while(true){
			
		} 
	}
}
