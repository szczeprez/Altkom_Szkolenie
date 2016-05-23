package modul04.ex03;

import static java.lang.Character.isUpperCase; 

public class Zdanie {

	/**
	 * Wypisanie zdanie od konca do pocz¹tku odwracaj¹c wielkoœci liter
	 */
	public static void main(String[] args) {
		String text = "Ala ma Kota";
		String wspak = "";

		for (int i = text.length() - 1; i >= 0; i--) {
			char znak = text.charAt(i);
			if (Character.isLetter(znak)) {
				if (isUpperCase(znak)) {
					znak = Character.toLowerCase(znak);

				} else {
					znak = Character.toUpperCase(znak);
				}
			}
			wspak += znak;
		}

		System.out.println(text);
		System.out.println(wspak);

	}
}
