package mod05.ex03;

public class Bank {

	/*	Bezpieczne wielow¹tkowo
	 * private static Bank instanceBank = new Bank();*/
	
	private static Bank instanceBank;
	public static final int MAX_ACCOUNTS = 100;
	private Account[] accounts = new Account[MAX_ACCOUNTS];
	private int currentAccount;

	private Bank() {
	}

	public static Bank getInstanceBank() {
		if (instanceBank == null) {
			instanceBank = new Bank();
		}
		/**
		 * bezpieczna wielow¹tkowo trzeba zminiæ 
		 * private static Bank instanceBank = new Bank(); 
		 * oraz usun¹c warunek if z tej metowy !
		 * pozostaje tylko return z instanceBank ;
		 */
		return instanceBank;

	}

	public boolean addAccount() {
		if (currentAccount == MAX_ACCOUNTS) {
			return false;
		}
		accounts[currentAccount] = new Account(currentAccount, 0);
		currentAccount++;
		return true;
	}

	public boolean payIn(int number, double amount) {
		if (number < 0 || number >= currentAccount) {
			return false;
		}
		accounts[number].setBalance(accounts[number].getBalance() + amount);
		return true;
	}

	public boolean payOut(int number, double amount) {
		if (number < 0 || number >= currentAccount) {
			return false;
		}
		double savings = accounts[number].getBalance();
		if (amount > savings) {
			return false;
		}

		accounts[number].setBalance(savings - amount);
		return true;
	}

	public double getTotalBalance() {
		double total = 0;
		for (int i = 0; i < accounts.length; i++) {
			total += accounts[i].getBalance();
		}
		return total;
	}
}
