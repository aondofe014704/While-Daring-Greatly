import java.util.Scanner;

public class AccountTest{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

Account myAccount = new Account();

System.out.printf("Initial name is: %s%n%n", myAccount.getName());
System.out.println("please enter the name");
String theName = scanner.nextLine();
myAccount.setName(theName);

System.out.printf("Name in the object myAccount is: %n%s%n", myAccount.getName());





}

}