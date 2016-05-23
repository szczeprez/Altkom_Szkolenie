package mod05.ex04;

public class Car extends Vehicle {

	public Car(String name) {
		super(name);
	}

	@Override
	public double getFluelNeeds() {
		return 50;
	}

	@Override
	public double getDistanse() {
		return 638;
	}

}
