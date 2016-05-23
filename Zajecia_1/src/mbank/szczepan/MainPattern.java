package mbank.szczepan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPattern {

	/*
	 * tekst, link, html odkodowaæ !!!
	 */
 
	public static void main(String[] args) {
		Pattern p = Pattern.compile("k*t"); 
		Matcher m = p.matcher("koootek"); 
		boolean b = m.matches(); 
		
		System.out.println(b);
		
		boolean c = Pattern.matches("k*t", "kkt"); 
		System.out.println(c);
		
		Pattern p1 = Pattern.compile("[,\\s]+"); 
		String[]result = p.split("one,two, three four , five"); 
		for (String i : result) {
			System.out.print("|" + i + "|");
		}
		
		Pattern p2 = Pattern.compile("\\\\"); 
		String[]result1 = p.split("c:\\window\\system"); 
		for (String i : result1) {
			System.out.print("|" + i + "|");
		}

	}

}
