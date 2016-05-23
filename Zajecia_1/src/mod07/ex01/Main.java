package mod07.ex01;
 
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;

public class Main {
 

	/**
	 * Prawy przycisk -> Run -> Run Configuration
	 * <br> Arguments -> Run
	 * <br> uruchamia program z argumentamidla tablicy args
	 * @param args
	 */
	public static void main(String[] args){
		/*for (int index = 0; index < args.length; index++) {
			System.out.println(args[index]);
		}*/
		Properties prop = System.getProperties(); 
	 prop.list(System.out); 
		//System.out.println(System.getProperties());
		
 System.out.println(" -------------- ");
	 //   System.out.println(prop.getProperty("user.dir" ));
	 //	System.out.println(System.getProperty("user.dir"));
		
		
		/**
		 * Lepsze rozwi¹zanie od String poniewa¿ nie tworzy nowego obiektu
		 * <br> StringBuldier przy wyko¿ystaniu wielow¹tkowoœci
		 * <br> StringBuffer nie zapewnia synchronizacji
		 * 
		 */
		StringBuffer sb = new StringBuffer(); 
		sb.append("Ala "); 
		sb.append("ma "); 
		sb.append("kota"); 
		String st = sb.toString(); 
		
		System.out.println(st);
		
		
		/**
		 * Local -> new Locale("pl", "PL"); 
		 * 	<br>1 233,12 z³
			<br>$1,233.12
		 */
		Locale polska = new Locale("pl", "PL");
		Locale usa = Locale.US; 
		NumberFormat nf = NumberFormat.getCurrencyInstance(polska); 
		NumberFormat nfu = NumberFormat.getCurrencyInstance(usa); 
		double pensja = 1233.12; 
		System.out.println(nf.format(pensja));
		System.out.println(nfu.format(pensja));
		
		
		Locale.getDefault(); // zwraca z jakiego korzystamy aktualnie
		System.out.println(Locale.getDefault());
		
System.out.println("---------------------");
		
		Set<Object> set = new HashSet<Object>(); 
		set.add(213); 
		set.add("asdf"); 
		set.add("22asdf"); 
		
		for(Iterator  i = set.iterator(); i.hasNext(); ){
			Object element = i.next(); 
			System.out.println(element);
			 if (element instanceof String) {
				 
				i.remove(); 
			} 
		}
		

		System.out.println("----------");
		System.out.println(set.size());
		
 /*
  * Niemutowalne tzn. zmiana obiektu powoduje utworzenie nowego. 
  */
	 
	 boolean b = Boolean.parseBoolean("true"); 
	 if(b)
		 System.out.println("boolean jest = " + b);
	 
	 Main m = new Main();
	 m.toString(); 
	 
	}
	@Override
	public String toString() {
 
		return super.toString() + " !!!";
	}
	
@Override
public int hashCode() {
	//http://tutorials.jenkov.com/java-collections/hashcode-equals.html
	return super.hashCode();
}
}
