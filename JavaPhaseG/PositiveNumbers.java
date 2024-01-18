import java.util.Scanner;

public class PositiveNumbers{

public static void main(String[] args){

System.out.println("Enter positive numbers from 1 to 20");
Scanner userInput = new Scanner(System.in);

int positiveNumber = userInput.nextInt();

for(int count = 1; count <= positiveNumber; count++ ){

positiveNumber *= count;

System.out.printf("%d%n%d%n", positiveNumber, count);

}

}

}