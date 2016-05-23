package mod05.ex04;

public class Plane extends Vehicle implements Flying {

	public Plane(String name) {
		super(name);
	}

	@Override
	public void takeOff() {
		System.out.println(this + " takeOff");
	}

	@Override
	public void land() {
		System.out.println(this + " land");
	}

	@Override
	public void callAirControl() {
		System.out.println(this + " crequested clearancee for landing.");
	}

	@Override
	public double getFluelNeeds() {
		return 30_000;
	}

	@Override
	public double getDistanse() {
		return 3_000;
	}

	@Override
	public void go() {
		super.go();
		takeOff(); 
	}

	@Override
	public void stop() {
		land(); 
		super.stop();
		
	}
}
