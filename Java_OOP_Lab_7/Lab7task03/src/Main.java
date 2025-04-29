class BankAccount {
    double getInterestRate() {
        return 0.05;
    }
}

class SavingsAccount extends BankAccount {
    double getInterestRate() {
        return 0.10;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        SavingsAccount b2 = new SavingsAccount();

        double rate1 = b1.getInterestRate();
        double rate2 = b2.getInterestRate();

        System.out.println("Interest Rate of BankAccount: " + rate1);
        System.out.println("Interest Rate of SavingsAccount: " + rate2);
    }
}
