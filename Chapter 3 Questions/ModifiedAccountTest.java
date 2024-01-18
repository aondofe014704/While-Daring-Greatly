import java.util.Scanner;
public class ModifiedAccountTest{

public static void main(String[] args){


ModifiedAccount accountTrier = new ModifiedAccount("Jack Songu", 100.70);

System.out.printf("%s balance: $%.2f%n", accountTrier.getName(), accountTrier.getBalance());


Scanner cashAmount = new Scanner(System.in);

double amount = cashAmount.nextDouble();

System.out.println("please enter withdrawal Amount");

double cashAmount = accountTrier.nextDouble();
System.out.printf("%n Minusing %.2f from accountTrier balance%n%n", withdrawalAmount); 




}




}