
import java.util.Scanner;
public class LargestSmallest{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter integer1: ");
int number1 = scanner.nextInt();

System.out.print("Enter integer2: ");
int number2 = scanner.nextInt();

System.out.print("Enter integer3: ");
int number3 = scanner.nextInt();

System.out.print("Enter integer4: ");
int number4 = scanner.nextInt();

System.out.print("Enter integer5: ");
int number5 = scanner.nextInt();

if(number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5)
System.out.println(number1 + " is Highest");

if(number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5)
System.out.println(number2 + " is Highest");

if(number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5)
System.out.println(number3 + " is Highest");

if(number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5)
System.out.println(number4 + " is Highest");

if(number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4)
System.out.println(number5 + " is Highest");

if(number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5)
System.out.print(number1 + " is Lowest");

  }

}