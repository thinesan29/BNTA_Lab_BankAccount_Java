import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Thinesan","Manoseelan", LocalDate.of(2000,1,29),11111111);
        account1.deposit(1000);
        account1.withdrawal(50);
        account1.payInterest(0.01); // Paying 1%  interest
        String statement = account1.generateStatement();
        System.out.println(statement);
        System.out.println("You have a balance of : " + account1.getBalance());

        BankAccount account2 = new BankAccount("Bob","Lewis",LocalDate.of(1995,6,25),22222222);
        account2.deposit(2000);
        account2.withdrawal(100);
        account2.payInterest(0.02); // Paying 2%  interest
        String statement2 = account2.generateStatement();
        System.out.println(statement2);
        System.out.println("You have a balance of : " + account2.getBalance());



    }



}
