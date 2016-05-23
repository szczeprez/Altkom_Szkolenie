package mod05.ex04;

public abstract class Vehicle {

	private String name;

	public Vehicle(String name) {
		super();
		this.name = name;
	}

	public abstract double getFluelNeeds();

	public abstract double getDistanse();

	public double calculateFluelEfficiency() {
		return getFluelNeeds() / getDistanse() * 100;
	} 

	/**
	 * Zastosowanie REFLEKCJI
	 * 1) Class c = String.class;<br>
	 * 2) Class c = s.getClass(); - metoda z klasy Object<br>
	 * 3) Class c = Class.forName("java.lang.String"); Nazw� klasy wraz z pakietem <br>
	 * <br>
	 * Od java 7 zastosowane s� uchwyty method kt�re zabezpieczaj� dost�py do
	 * metod.
	 * <br>
	 * na <b>this</b> jest wywo�ana metoda toString() a poniewa� jest przedefiniowana
	 * to zostanie wy�wietlony name.
	 */
	public void go() {
		System.out.println(	getClass().getName() + ": " + this + " started"	);
	}

	public void stop() {
		System.out.println( getClass().getName() + ": " + this + " stopped");
	}

	@Override
	public String toString() {
		return name;
	}
}
