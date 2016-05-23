package mbank.szczepan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class WebReader {

 
	public static void main(String[] args) throws IOException {
		/*try {
			URL url = new URL("http://mbank.pl");
			 PrintStream ps = new PrintStream("outweb.txt"); 
			 System.setOut(ps); 
			
 			BufferedReader br = new BufferedReader(
					new InputStreamReader(url.openStream()));  
			String line = null ;
			while((line = br.readLine()) != null){
	
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
	 		
		MessageFormat mf = new MessageFormat("Dnia{1} z miasta {0}"); 
		Object[] arguments = new Object[]{
			  ResourceBundle.getBundle("first.city"), 
			  ResourceBundle.getBundle("secund.city")
		}; 
		
		System.out.println(mf);

	}
/*
 * I18N
 * Skrót od I internationalizatioN
 * prezentacja str 338.
 */
	
	
}
