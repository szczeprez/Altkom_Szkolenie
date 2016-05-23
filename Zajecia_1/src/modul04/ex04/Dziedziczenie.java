package modul04.ex04;

class A {
	int a;

	public A(int aa) {
		this.a = aa;
	}

	public String getInfo() {
		return "method getInfo in class A	";
	}

}
/*
 * Klasa Dziedziczenie jest tak¿e klas¹ A => Polimorfizm (Wielopostaciowoœæ)
 */
public class Dziedziczenie extends A {
	int bb;
	int cc;

	public Dziedziczenie(int aa) {
		super(aa);
		this.bb = 22;
		this.cc = 33;
	}

 @Override
	public String getInfo() {
	 
	return super.getInfo();
}

	public static void main(String[] args) {

	}

}
