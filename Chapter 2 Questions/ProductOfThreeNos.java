import java.util.Scanner;

public class ProductOfThreeNos{

public static void main(String[] args){

System.out.println("Enter product one");

Scanner product = new Scanner(System.in);

int product1 = product.nextInt();
System.out.println("Enter product two");
int product2 = product.nextInt();
System.out.println("Enter product three");
int product3 = product.nextInt();

int sumOfProduct = product1 * product2 * product3;

System.out.printf("The product is %d%n", sumOfProduct);
}

}