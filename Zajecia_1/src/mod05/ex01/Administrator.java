package mod05.ex01;

public class Administrator extends Employee {
	private String responsibility = "Backoffice";

	public Administrator(String name) {
		super(name);
	}

	@Override
	public String getInfo() {
		return super.getInfo() + ", res:" + responsibility;
	}
}
