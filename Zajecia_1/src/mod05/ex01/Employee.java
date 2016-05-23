package mod05.ex01;

public class Employee {
	private String name; // przyjmuje wartoœæ pocz¹tkowe = null
	private int salary = 100; // 0
	private String info;	  // null

	public Employee(String name) {
		super(); // wywo³uje siê konstruktor klasy Object
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
