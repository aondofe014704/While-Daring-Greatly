import java.util.Scanner;

public class MyAccountTest{

public static void main(String[] args){
Scanner input1 = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);

MyAccount semicolon = new MyAccount();

System.out.print("Enter your name: ");
String name = input1.nextLine();

System.out.print("Enter Deposit Amount: ");
double amount = input2.nextDouble();

System.out.print("Enter withdrawal Amount: ");
double withdraw = input2.nextDouble();

semicolon.setName(name);
String collectedName = semicolon.getName();

semicolon.deposit(amount);
double balance = semicolon.checkBalance();

semicolon.withdrawal(withdraw);
double result = semicolon.checkBalance();

System.out.println("********************************");
System.out.println("Your name is: " + collectedName);
System.out.println("You deposited: $" + amount);
System.out.println("You withdraw: $" + withdraw );
System.out.println("Your current Balance : $" + result);
System.out.print("*************************************");


}

}