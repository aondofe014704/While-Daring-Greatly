import java.util.Scanner;

public class ComparingIntegers{
public static void main(String[] args){}

System.out.println("Enter an integer");

Scanner integer = new Scanner(System.in);


int theNumber = integer.nextInt();
int squareOfNumber = theNumber * theNumber;

if(squareOfNumber == 100){
System.out.printf("%d == %d%n,squareOfNumber");

}


}