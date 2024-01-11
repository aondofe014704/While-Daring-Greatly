import java.util.Scanner;

public class ItemPrice{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("please name of item");
String noOfItem = scanner.nextLine();
System.out.println("please enter the price");
double priceOfItem = scanner.nextInt();
double discountPercent = priceOfItem - (priceOfItem * 10/100.0); 

System.out.print("-----------------------");
System.out.print("----------------------");
}
}