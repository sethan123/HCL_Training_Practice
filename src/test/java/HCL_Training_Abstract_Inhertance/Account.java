//4) Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. 
//The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, 
//withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and 
//have their own unique methods.
//
// 
//
//Sample output:
//Savings Account:
//Initial Deposit: $1000.00
//Interest rate: 1.25%
//
// 
//
//Current Account:
//Initial Deposit: $5000.00
//OverdraftLimit: $1000.00
//
// 
//
//Now deposit $100 to Savings Account.
//Now deposit $500 to Current Account.
//Withdraw $150 from Savings Account.
//
// 
//
//
//Savings A/c and Current A/c.:
//Account balance: 950.0
//Account balance: 5500.0
//
// 
//
//After applying interest on Savings A/c for 1 year:
//Savings A/c and Current A/c.:
//Account balance: 961.875
//Account balance: 5500.0
//
//

package HCL_Training_Abstract_Inhertance;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest(int years);
    void viewBalance();
}

class SavingsAccount1 implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount1(double initialDeposit, double interestRate) {
        balance = initialDeposit;
        this.interestRate = interestRate;
        System.out.println("Savings Account:");
        System.out.println("Initial Deposit: $" + initialDeposit);
        System.out.println("Interest rate: " + interestRate + "%");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nNow deposit $" + amount + " to Savings Account.");
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw $" + amount + " from Savings Account.");
    }

    public void calculateInterest(int years) {
        double interest = balance * (interestRate / 100) * years;
        balance += interest;
    }

    public void viewBalance() {
        System.out.println("Savings A/c and Current A/c.:");
        System.out.println("Account balance: " + balance);
    }
}

class CurrentAccount1 implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount1(double initialDeposit, double overdraftLimit) {
        balance = initialDeposit;
        this.overdraftLimit = overdraftLimit;
        System.out.println("\nCurrent Account:");
        System.out.println("Initial Deposit: $" + initialDeposit);
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nNow deposit $" + amount + " to Current Account.");
    }

    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " from Current Account.");
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    public void calculateInterest(int years) {
        // Current account does not earn interest
    }

    public void viewBalance() {
        System.out.println("Savings A/c and Current A/c.:");
        System.out.println("Account balance: " + balance);
    }
}

class Bank {
    private Account[] accounts;
    private int numOfAccounts;

    public Bank() {
        accounts = new Account[100];
        numOfAccounts = 0;
    }

    public void addAccount(Account account) {
        accounts[numOfAccounts] = account;
        numOfAccounts++;
    }

    public void applyInterest(int years) {
        for (int i = 0; i < numOfAccounts; i++) {
            accounts[i].calculateInterest(years);
        }
    }

    public void viewAccountBalances() {
        for (int i = 0; i < numOfAccounts; i++) {
            accounts[i].viewBalance();
        }
    }
}

