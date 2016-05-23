package mod06.ex01;

public class PrepaidPhone {
	private int limit;

	public PrepaidPhone(int startLimit) {
		limit = startLimit;
	}
	
	public void makeCall(int min) throws PrepaidPhoneException {
		if(min > limit){
			throw new PrepaidPhoneException("Current call exceed limit of " 
		+ limit); 
		}
		
		limit -= min;
		System.out.println("\tNice talk...");
	}
	
	public int getLimit() {
		return limit;
	}

	public void addToLimit(int min) {
		limit += min;
	}
}
/* str: 223
PAKOWANIE JAR: 
	1) Tworzê plik textowy manifest.mf
	2) wchodzê w katalog bin np. C:\Users\Altkom\workspace\Zajecia_1\bin>
	3) wpisuje komende: 
		C:\Users\Altkom\workspace\Zajecia_1\bin>jar cfmv phone.jar C:\Users\Altkom\Deskt
	op\manifest.mf mod06\ex01\*.class
	4) uruchamiam: 
		java -jar phone.jar
		*/