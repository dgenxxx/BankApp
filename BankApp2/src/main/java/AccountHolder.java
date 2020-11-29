public class AccountHolder {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String openingDate;
    private final String openingBalance;
    private final Account account;

    AccountHolder(String firstName, String lastName, String address, String openingDate, String openingBalance, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.openingDate = openingDate;
        this.openingBalance = openingBalance;
        this.account = account;
    }
    
    @Override
    public String toString(){
        return "\nAccount Holder Information\n" +
                "First Name: " + firstName + "\n" + 
                "Last Name: " + lastName +  "\n" + 
                "Address: " + address +  "\n" + 
                "Opening Date: " + openingDate +  "\n" +
                "Opening Balance: " + openingBalance +  "\n" + 
                account;
    }
    
    public String basicInfo(){
        return " Account Number: " + account.getAccountNumber() + " - Name: " + getFirstName() + " " + getLastName();
    }
    
    Account getAccount(){
        return account;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    
}
