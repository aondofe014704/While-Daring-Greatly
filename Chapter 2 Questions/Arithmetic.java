import java.util.Scanner;

public class Arithmetic{
public static void main(String[] args){

Scanner userInput = new Scanner(System.in);

System.out.println("Enter first integer");
int integer1 = userInput.nextInt();
int square1 = integer1 * integer1;
System.out.printf("%s%n%d%n", "The square of integer one is:", square1);

System.out.println("Enter second integer");
int integer2 = userInput.nextInt();
int square2 = integer2 * integer2;
System.out.printf("%s%n%d%n","The square of integer two is:", square2);

int sumOfSquares = square1 + square2;
System.out.printf("%s%n%d%n", "The sum of squares is:", sumOfSquares);

int difference = square1 - square2;

System.out.printf("%s%n%d%n", "The Difference of the square is:", difference);






}
}