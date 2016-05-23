package modul02.ex02;

public class Test {

	public static void main(String[] args) {
		
		Date start = new Date(1990, 10, 12); 
		Date end = new Date(2005,10,24); 
		
		System.out.println(start.toString());
		System.out.println(end.toString());
		
		
		Date today;
		today = start; 
		System.out.println(today);
		today.year = 1999; 
		today.day = 24; 
		
		System.out.println(today);
		
		end = today; 
		
		System.out.println(end);
		
		
		
	}

}
