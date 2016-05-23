package mod05.ex04;

public class Test {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[5];
		vehicles[0] = new Car("Renault");
		vehicles[1] = new Truck("Star");
		vehicles[2] = new RaceCar("Porshe");
		vehicles[3] = new Plane("Dreamliner");
		vehicles[4] = new Ship("Titanic");

		for (Vehicle v : vehicles) {
			v.go();
			if (v instanceof Flying) {
				((Flying) v).callAirControl();
			}
			v.stop();
			System.out.println("Efficiency: " + v.calculateFluelEfficiency()
					+ "\n");
		}
	}

}
