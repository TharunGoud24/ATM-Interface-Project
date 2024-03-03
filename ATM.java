import atm.*;
import java.util.Scanner;

public class ATM {
    public User currentUser;
    

    public void start() {
        // Implement user authentication
        authenticateUser();

        // Display ATM functionalities
        displayMenu();
    }
    
    public void authenticateUser(){
    Scanner sc=new Scanner(System.in);
    User user1=new User("100",2648,10000);
    User user2=new User("101",1234,40000);
    User user3=new User("102",2580,35000);
    User user4=new User("103",1435,60000);
    User user5=new User("104", 2244,80000);
    System.out.print("Enter userId : ");
    String enteredUserId=sc.next();
    if(enteredUserId.equals(user1.getUserId()))
    {
        System.out.print("Enter PIN : ");
        int enteredPIN=sc.nextInt();
       currentUser=user1;
       if(enteredPIN==user1.getPIN()){
       System.out.println("Authentication successful. Welcome, " + currentUser.getUserId() + "!");
        }
        else{
        System.out.print("Enter a Valid PIN");
        System.exit(0);
    }
}
    else if(enteredUserId.equals(user2.getUserId()))
    {
       System.out.print("Enter PIN : ");
       int enteredPIN=sc.nextInt();
       currentUser=user2;
       if(enteredPIN==user2.getPIN()){
       System.out.println("Authentication successful. Welcome, " + currentUser.getUserId() + "!");
       }
       else{
        System.out.print("Enter a Valid PIN");
        System.exit(0);
       }
    }
    else if(enteredUserId.equals(user3.getUserId()))
    {
       System.out.print("Enter PIN : ");
       int enteredPIN=sc.nextInt();
       currentUser=user3;
       if(enteredPIN==user3.getPIN()){
       System.out.println("Authentication successful. Welcome, " + currentUser.getUserId() + "!");
       }
       else{
        System.out.print("Enter a Valid PIN");
        System.exit(0);
       }
    }
    else if(enteredUserId.equals(user4.getUserId()))
    {
       System.out.print("Enter PIN : ");
       int enteredPIN=sc.nextInt();
       currentUser=user4;
       if(enteredPIN==user4.getPIN()){
       System.out.println("Authentication successful. Welcome, " + currentUser.getUserId() + "!");
       }
       else{
        System.out.print("Enter a Valid PIN");
        System.exit(0);
       }
    }
    else if(enteredUserId.equals(user5.getUserId()))
    {
       System.out.print("Enter PIN : ");
       int enteredPIN=sc.nextInt();
       currentUser=user5;
       if(enteredPIN==user5.getPIN()){
       System.out.println("Authentication successful. Welcome, " + currentUser.getUserId() + "!");
       }
       else{
        System.out.println("Enter a Valid PIN");
        System.exit(0);
       }
    }
    else {
        System.out.println("Authentication failed. Please enter a valid userId and try again.");
        System.exit(0);
       // authenticateUser(); // Recursive call for reauthentication
    }
    }


    private void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
          System.out.print("Enter Your choice:");
          int a=scanner.nextInt();
          switch(a){
        case 1:checkBalance();
               break;
        case 2:withdrawMoney();
               break;
        case 3:depositMoney();
               break;
        case 4:exit();
               break;
        default:System.out.print("Invalid choice. Please try again.");
          }
    }
}
     //checking balance
    public void checkBalance()
    {
        System.out.print("Current Balance: Rs."+currentUser.getAccountBalance());
    }
    //withdrawing money
    public void withdrawMoney()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: Rs."); 
        double amount =scanner.nextDouble();
        if(amount<=currentUser.getAccountBalance()&&amount>0){
         currentUser.setAccountBalance(currentUser.getAccountBalance()-amount);
         System.out.println("Withdrawal successful. Remaining balance: Rs." + currentUser.getAccountBalance());
        }
        else
        {
            System.out.println("Invalid amount or insufficient funds. Please try again.");
        }
    }
    //depositing money
    public void depositMoney()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the amount to deposit:Rs.");
        double amount=scanner.nextDouble();
        if(amount>0){
        currentUser.setAccountBalance(currentUser.getAccountBalance()+amount);
        System.out.println("Deposit successful. New balance: Rs." + currentUser.getAccountBalance());
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }
    
    public void exit(){
        System.out.println("Thank you for using the ATM.");
        System.exit(0);
    }
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.start();
    }
}
