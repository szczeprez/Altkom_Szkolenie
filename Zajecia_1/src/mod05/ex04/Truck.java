package mod05.ex04;

public class Truck extends Car {

	public Truck(String name) {
		super(name);
	}

	@Override
	public double getFluelNeeds() {
		return 90;
	}
}
