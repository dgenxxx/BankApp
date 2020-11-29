import java.util.Scanner;

public class Menu {
    Scanner keyboard = new Scanner(System.in);
    Bank bank = new Bank();
    boolean exit;
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.RunMenu();
        
    }

    public void RunMenu(){
        printHeader();
        while(!exit){
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    private void printHeader() {
        System.out.println("+----------------------------+");
        System.out.println("|   Bank Management System   |");
        System.out.println("+----------------------------+");
    }

    private void printMenu() {
         System.out.println("1) Create a new account");
         System.out.println("2) Make a deposit");
         System.out.println("3) Make a withdrawal");
         System.out.println("4) List of accounts with general details");
         System.out.println("5) Choosen account number with the last 6 transactions");
         System.out.println("6) Delete a closed account");
         System.out.println("7) Exit");
         
        }
         
         
    private int getInput() {
        int choice = -1;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(keyboard.nextLine());
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid selection. Numbers only please.");
            }
            if(choice < 0 || choice > 7){
                System.out.println("Choice out of range. Please choose again.");
            }
         }while(choice <0 || choice > 7);
           return choice;
    }

    private void performAction(int choice) {
        switch(choice){
            case 0:
                System.out.println("Exit Bank App");
                System.exit(0);
                break;
            case 1:
                createAccount();
                break;
            case 2:
                makeDeposit();
                break;
            case 3:
                makeWithdrawal();
                break;
            case 4:
                listAccounts();
                break;
            case 5:
                sixTransactions();
                break;
            case 6:
                deleteAccount();
                break;
            default:
                System.out.println("Unknown error has occured.");
        }
    }

    private void createAccount() {
        String firstName, lastName, address, openingDate, openingBalance;
    }
    {
        System.out.print("Enter first name: ");
        String firstName = keyboard.nextLine();
        System.out.print("Enter last name: ");
        String lastName = keyboard.nextLine();
        System.out.print("Enter address: ");
        String address = keyboard.nextLine();
        System.out.print("Enter opening date: ");
        String openingDate = keyboard.nextLine();
        System.out.print("Enter opening balance: ");
        String openingBalance = keyboard.nextLine();
        
    
    Account account = null;
    AccountHolder accountholder = new AccountHolder(firstName, lastName, address, openingDate, openingBalance, account);
    bank.addAccountHolder(accountholder);
    }
    
    
    private void makeDeposit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void makeWithdrawal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void listAccounts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sixTransactions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
        
        
        
        

    

