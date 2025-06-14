package my.bankaccount;

// ✅ Interface
interface Taxable {
    double calculateTax();
}

// ✅ Abstract Class
abstract class Account {
    private String accountNo;
    private int balance;
    private String ownerName;

    public Account(String accountNo, int balance, String ownerName) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance to withdraw!");
        }
        balance -= amount;
        System.out.println(amount + " withdrawn. Remaining balance: " + balance);
    }

    // Must be overridden
    abstract void calculateInterest();
}

// ✅ SavingsAccount implements Taxable
class SavingsAccount extends Account implements Taxable {
    public SavingsAccount(String accNo, int balance, String owner) {
        super(accNo, balance, owner);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest for SavingsAccount is 2%");
    }

    @Override
    public double calculateTax() {
        return getBalance() * 0.05; // 5% tax
    }
}

// ✅ CurrentAccount
class CurrentAccount extends Account {
    public CurrentAccount(String accNo, int balance, String owner) {
        super(accNo, balance, owner);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest for CurrentAccount is 5%");
    }
}

// ✅ Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// ✅ Utility class for printing (Polymorphism)
class StatementPrinter {
    public static void printStatement(Account acc) {
        System.out.println("===== Account Statement =====");
        System.out.println("Owner: " + acc.getOwnerName());
        System.out.println("Account No: " + acc.getAccountNo());
        System.out.println("Balance: " + acc.getBalance());
        acc.calculateInterest();
        if (acc instanceof Taxable) {
            System.out.println("Tax: " + ((Taxable) acc).calculateTax());
        }
        System.out.println("=============================");
    }
}

// ✅ Main Class
public class MyBankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 1000, "Mahboob Ali");
        CurrentAccount ca = new CurrentAccount("CA456", 2000, "John Doe");

        try {
            sa.deposit(500);
            sa.withdraw(300);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            ca.withdraw(2500); // This will throw custom exception
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        // ✅ Polymorphic Print
        StatementPrinter.printStatement(sa);
        StatementPrinter.printStatement(ca);
    }
}
