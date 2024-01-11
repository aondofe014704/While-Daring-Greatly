import java.util.Scanner;
public class StandardInput{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter first integer");
int x = input.nextInt();

System.out.println("Enter second integer");

int y = input.nextInt();

System.out.println("Enter third integer");

int z = input.nextInt();

int result = x * z * y;
System.out.printf("The result of the product is: %d%n", result);










}

}