package mod04.ex01;

import java.util.Random;

public class Tablice {

	public Tablice() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int[] tab1 = new int[50_999_999]; 
		int[] tab2 = new int[tab1.length]; 
		long start = 0; 
		long end = 0; 
		
		Random r = new Random(); 
		for (int i : tab1  ) {
			 tab1[i] = r.nextInt(90) + 10; 
		}
		start = System.currentTimeMillis(); 
		
	
		for (int i : tab2) {
			tab2[i] = tab1[i]; 
		}
		end = System.currentTimeMillis(); 
		
		System.out.println("Kopiowanie tablicy trwa³o = " + (end - start) + " ms");
		
		start = System.currentTimeMillis(); 
		System.arraycopy(tab1, 0, tab2, 0, tab1.length);
		end = System.currentTimeMillis(); 
		System.out.println("Kopiowanie System trwa³o = " + (end - start)/1e4 + " ms");
	}

}
