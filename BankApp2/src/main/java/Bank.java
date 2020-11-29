import java.util.ArrayList;

public class Bank {
    ArrayList<AccountHolder> accountholders = new ArrayList<AccountHolder>();

    void addAccountHolder(AccountHolder accountholder) {
        accountholders.add(accountholder);
    }
    
}
