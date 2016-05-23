package mod04.ex01;

 
public class Cwicz04 {
	/**
	 * 
	 * Liczby pierwsze
	 * Wyliczanie silni
	 * Wyniczenie ci¹gu Fibonathego
	 * 
	 */
	
	public static boolean Pierwsza(int n) {
		if (n == 2)
			return true;
		if ((n == 1) || (n % 2 != 0))
			return false;

		for (int i = 3; i < Math.ceil(Math.sqrt(n)); i++) {
			if ((n % i) != 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int liczbyPodzielnePrzezSiedem = 0;
		int liczbyPodzielnePrzezTrzynascie = 0;
		int liczbyPodzielnePrzezDwadziesciaDziewiec = 0;
		int liczbyPodzielnePrzezCzterdziesciTrzy = 0;
		int iloscLiczPierwszych = 0;

		for (int i = 1234; i <= 2345; i++) {
			if (i % 7 == 0)
				liczbyPodzielnePrzezSiedem++;

			if (i % 13 == 0)
				liczbyPodzielnePrzezTrzynascie++;

			if (i % 29 == 0)
				liczbyPodzielnePrzezDwadziesciaDziewiec++;

			if (i % 43 == 0)
				liczbyPodzielnePrzezCzterdziesciTrzy++;

		}
		System.out
				.println("Liczby podzielne przez 7 = "
						+ liczbyPodzielnePrzezSiedem
						+ " \n"
						+ "Liczby podzielne przez 13 = "
						+ liczbyPodzielnePrzezTrzynascie
						+ " \n"
						+ "Liczby podzielne prze 29 = "
						+ liczbyPodzielnePrzezDwadziesciaDziewiec
						+ " \n"
						+ "Liczby podzielne przez 43 = "
						+ liczbyPodzielnePrzezCzterdziesciTrzy
						+ " \n"
						+ "Wysztkich liczb jest = "
						+ (liczbyPodzielnePrzezCzterdziesciTrzy
								+ liczbyPodzielnePrzezDwadziesciaDziewiec
								+ liczbyPodzielnePrzezSiedem + liczbyPodzielnePrzezTrzynascie));

		// Liczby pierwsze
		for (int n = 1234; n <= 2345; n++) {
			if (Pierwsza(n))
				System.out.println(n);

		} // koniec for
		System.out.println("Ilosc licz pierwszych = " + iloscLiczPierwszych);

	}
}


/*
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

*/
