import java.util.Random;

public class BankAccount {
    // Attributes / Fields
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    private static int numberOfAccounts;
    private static double totalMoney;

    // Constructors
    public BankAccount() {
        this.accountNumber = this.randAcctNum();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }
    
    // Methods
    private String randAcctNum() {
        String accountNumber = "";
        // To-Do Return 1 random 10 digit # in a string
        // pull 1 random # and concat to acctnum
        // pull it 9 more times
        Random  r = new Random();
        for (int i = 0; i < 10; i++) {
            accountNumber = accountNumber.concat(String.valueOf(r.nextInt(10)));
        }
        return accountNumber;
    }
    
    // Deposit to Checking or Savings
    public void depositMoney(double amount, String acctType) {
        if (acctType.equals("checking")) {
            // to do: Dep to Checking
            // SET Checking Balance
            this.setCheckingBalance(this.getCheckingBalance() + amount);
            // Increase total Money
        } else if (acctType.equals("savings")) {
            // ToDo Dep to Savings
            // SET Savings Balance
            this.setSavingsBalance(this.getSavingsBalance() + amount);
            // Increase total Money
        } else {
            System.out.println("Invalid acct type");
            return;
        }
        totalMoney += amount;
    }
    // Withdraw Money
    public void withdrawMoney(double amount, String acctType) {
        if (acctType.equals("checking")) {
            // to do: Withdraw from Checking
            // SET Checking Balance
            if (this.getCheckingBalance() - amount < 0) {
                System.out.println("Insufficient Funds");
            } else {
                this.setCheckingBalance(this.getCheckingBalance() - amount);                
                // Increase total Money
                totalMoney -= amount;
            }
        } else if (acctType.equals("savings")) {
            if (this.getSavingsBalance() - amount < 0) {
                System.out.println("Insufficient Funds");
            } else {
                this.setSavingsBalance(this.getSavingsBalance() - amount);                
                // Increase total Money
                totalMoney -= amount;
            }
        } else {
            System.out.println("Invalid acct type");
            return;
        }
    }    

    // Get Total Money
    public String getAcctTotal() {
        return "Total Money in Acct: " + (this.getCheckingBalance() + this.getSavingsBalance());
    }

    // Gettrs and Settrs

    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double getCheckingBalance() {
        return checkingBalance;
    }
    
    private void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    private void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static void setNumberOfAccounts(int numberOfAccounts) {
        BankAccount.numberOfAccounts = numberOfAccounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static void setTotalMoney(double totalMoney) {
        BankAccount.totalMoney = totalMoney;
    }
   
}
