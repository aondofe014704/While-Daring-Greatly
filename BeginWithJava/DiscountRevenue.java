import java.util.Scanner;
public class DiscountRevenue{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);



System.out.println("Enter product price");
int productPrice = scanner.nextInt();

System.out.println("The quantity purchased");
int quantityPurchased = scanner.nextInt();

int revenueProductPrice = productPrice * quantityPurchased;
System.out.println(revenueProductPrice);

int discountCalculation = (10 / 100) * productPrice;

if(discountCalculation > 5000){

int discountCalculation = (10 / 100) + productPrice;

}

 



 







}

}