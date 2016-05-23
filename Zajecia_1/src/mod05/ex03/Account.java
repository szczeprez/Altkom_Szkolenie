package mod05.ex03;

public class Account {
	private int numer;
	private double balance;

	public Account(int numer, double balance) {
		super();
		this.numer = numer;
		this.balance = balance;
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double d) {
		this.balance = d;
	}

}
