package mod05.ex04;

public class RaceCar extends Car {

	public RaceCar(String name) {
		super(name);
	}

	@Override
	public double getFluelNeeds() {
		return 75;
	}
}
