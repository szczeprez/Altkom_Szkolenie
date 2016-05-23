package mod05.ex04;

public class Ship extends Car implements Sailing {

	public Ship(String name) {
		super(name);
	}

	@Override
	public void dock() {
		System.out.println(this + " docked");
	}

	@Override
	public double getFluelNeeds() {
		return 500;
	}
	
	@Override
	public double getDistanse() {
		return 1_500;
	}
	
	@Override
	public void stop() {
		dock();
	}
}
