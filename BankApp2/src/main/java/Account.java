
public class Account {

    private double balance;
    private int accountNumber;
    private static int numberofAccounts;
    
    Account(){
        accountNumber = getNextAccountNumber();
    }
    
    public static int getNextAccountNumber(){
        return ++numberofAccounts;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    
}
