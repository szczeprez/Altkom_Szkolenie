package mod05.ex01;

public class Employee {
	private String name; // przyjmuje warto�� pocz�tkowe = null
	private int salary = 100; // 0
	private String info;	  // null

	public Employee(String name) {
		super(); // wywo�uje si� konstruktor klasy Object
		this.name = name;
		info = getInfo();
 	}
	
	public String getInfo(){
		return name+", salary: "+ salary;
	}

	public String getEmpInfo() {
		return info;
	}
}
