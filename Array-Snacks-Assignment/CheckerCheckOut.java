import java.util.ArrayList;
import java.util.Scanner;

public class CheckerCheckOut{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

ArrayList<String> customerItems = new ArrayList<String>();
ArrayList<Integer> customerNumber = new ArrayList<Integer>();
ArrayList<Double> customerPrice = new ArrayList<Double>();


System.out.println("what is the customer's name?");
String customerName = scanner.nextLine();


System.out.println("what did the user buy?");
String customerItem = scanner.nextLine();
customerItems.add(customerItems);

System.out.println("How many pieces?");
int customerPieces = scanner.nextInt();
customerNumber.add(customerNumber);

System.out.println("How much per unit?");
int pricePerUnit = scanner.nextInt();
customerPrice.add(customerPrice);


System.out.println("Add more items?");
String addItems = scanner.nextLine();
while(addItems.equalIgnoreCase("Yes")){
System.out.println("What did the user buy?");
customerItems = scanner.nextLine();
customerItems.add(customerItems);
}
















}

}