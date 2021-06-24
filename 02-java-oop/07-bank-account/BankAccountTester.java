public class BankAccountTester {
    
    public static void main(String[] args) {
        // ToDo Auto-generated method stub
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.depositMoney(10, "savings");
        System.out.println(myBankAccount.getAcctTotal()); // 10
        myBankAccount.depositMoney(100, "savings");
        System.out.println(myBankAccount.getAcctTotal()); //110
        System.out.println(BankAccount.getNumberOfAccounts()); //1
        System.out.println(BankAccount.getTotalMoney()); //110
        myBankAccount.withdrawMoney(10000, "checking"); //insufficient funds
        myBankAccount.withdrawMoney(60, "savings");
        System.out.println(myBankAccount.getAcctTotal()); // 50
    }
}
