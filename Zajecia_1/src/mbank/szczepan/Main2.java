package mbank.szczepan;

import java.io.FileNotFoundException;
import java.util.Scanner;
 
 
public class Main2 {

	public static void main(String[] args) throws FileNotFoundException {
 Scanner sc = new Scanner(System.in); 
 System.out.println(sc.radix());
 
 
 sum(new int[]{2,3,4}); 
 //sum(3,2,5,6,7); 
 
	}

	// VarArgs
	// przechodzi przy pojedyñczym int a nie przechodzi przy tablicy int
	// boxing nie obejmuje tablicy.
	//public sum(int ...x); 
	public static int sum(int[] x){
		int result = 0; 
		for (int i = 0; i < x.length; i++) {
			result += x[i]; 
		}
		return result; 
	}
}
/*		
 * ZAPISUJE DO PLIKU listê propeties.
 * PrintStream fw = new PrintStream(new File("output.txt")); 
Properties p = System.getProperties(); 
p.list(fw); */

/**
 * Obraniczenia stumieni binarnych najmiejsza porja to 1 bajt -> 8_bitów
 * w przypadku strumieni znakowych to 2 bajty - > 16_bitów.
 * 
 * Int posiada 4 baty
 * koniec odczytu FF FF FF FF
 * wartoœæ -1     00 00 00 FF
 */


/* Typy generyczne !
List l = new ArrayList<Double>(); 

Normalnie w typach generycznyn nie ma poliformizmu
Poni¿szy zapis wprowadza polimorfizm.
List <? extends T> //Typ T lub potomny
List <? super T> // Typ T lub przodek
*/

/*	
 * int[][] tab = { { 1, 2, 3, 5, 4, 6, 8 }, { 71, 62, 53, 45, 34, 26, 23 } };
 * 	for (int[] is : tab) {
for (int is1 : is) {
	System.out.print(is1 + " ");
}
}*/

/*
int[][] tab = { { 1, 2, 3, 5, 4, 6, 8 }, 
{ 71, 62, 53, 45, 34, 26, 23 } };

for (int[] is : tab) {
	for (int is1 : is) {
		System.out.print(is1 + " ");
	}
}
*/

// System.arraycopy(d,2 , y, 1, 3);

/*
 * koniec: for (int i = 0; i < tab.length; i++) { for (int j = 0; j <
 * tab.length; j++) { if(j == 3){ System.out.println(j); break koniec; } } }
 */
