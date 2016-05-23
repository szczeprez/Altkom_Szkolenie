package mod05.ex03;

public class TestBank {

	public static void main(String[] args) {
		
		Bank bank1 = Bank.getInstanceBank();
		for (int i = 0; i < Bank.MAX_ACCOUNTS; i++) {
			bank1.addAccount();
			bank1.payIn(i, 1_000);
		}
		System.out.println("Stan œrodków w banku #1: " + bank1.getTotalBalance());
		
		Bank bank2 = Bank.getInstanceBank(); 
		System.out.println("Stan œrodków w banku #2: " + bank2.getTotalBalance());
		
		System.out.println(bank1 == bank2);
	}

}
