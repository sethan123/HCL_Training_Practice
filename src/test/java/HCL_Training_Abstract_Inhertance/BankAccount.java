//1) Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). 
//Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the 
//respective methods to handle deposits and withdrawals for each account type.
//
// 
//
//Sample output:
//Savings A/c: Initial Balace: $1000.0
//Deposit of $500.0 successful. Current balance: $1500.0
//Withdrawal of $250.0 successful. Current balance: $1250.0
//
// 
//
//Try to withdraw: $1600.0
//Insufficient funds. Withdrawal failed.
//
// 
//
//Current A/c: Initial Balace: $5000.0
//Deposit of $1000.0 successful. Current balance: $6000.0
//Withdrawal of $3000.0 successful. Current balance: $3000.0
//
// 
//
//Try to withdraw: $6000.0
//Insufficient funds. Withdrawal failed.
package HCL_Training_Abstract_Inhertance;

abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}


class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}


