import java.time.LocalDate;

public class BankAccount {
    // Properties
    private String firstName;
    private String lastName;

    private LocalDate dateOfBirth;
    private int accountNumber ;

    private double balance; // working with currency so used double instead of int

    private double interest;

    // Constructor
    public BankAccount(String inputfirstName,
                       String inputlastName,
                       LocalDate dateOfBirth,
                       int accountNumber){
        this.firstName = inputfirstName;
        this.lastName = inputlastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;

    }


    // Behaviours/Methods

    public String generateStatement(){
        return "Hello " + this.firstName +" " +  this.lastName + "! Date of Birth : " + this.dateOfBirth + ". Account Number : " + this.accountNumber + "." ;

    }

    // Deposit method :
    public void deposit(double amount) {
        balance = balance + amount;
    } // balance

    // Withdrawal method :
    public void withdrawal (double amount) {
        balance = balance - amount;
    }

    // Pay Interest Method :

    public void payInterest(double interestRates) {
        interest = balance * interestRates;
        balance = balance + interest;
    }


    // Getters & Starters
    public double getBalance() {
        return balance;
    }


}
