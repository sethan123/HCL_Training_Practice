package HCL_Training_Abstract_Inhertance;

public class BankAccountInterface {

	    public static void main(String[] args) {
	        Bank bank = new Bank();

	        SavingsAccount1 savingsAccount = new SavingsAccount1(1000.0, 1.25);
	        CurrentAccount1 currentAccount = new CurrentAccount1(5000.0, 1000.0);

	        bank.addAccount(savingsAccount);
	        bank.addAccount(currentAccount);

	        savingsAccount.deposit(100.0);
	        currentAccount.deposit(500.0);
	        savingsAccount.withdraw(150.0);

	        bank.viewAccountBalances();

}
}
