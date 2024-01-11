import java.util.Scanner;

public class Multiplication{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter an input from 1 - 12: ");

int userInput = scanner.nextInt();
int count = 1;
if(userInput >12 || userInput <1){
	System.out.println("Invalid Input");
}
else{

while(count <=12){
	int result = userInput * count;
	System.out.printf("%d * %d = %d%n", userInput, count, result);
	count = count +1;

}

}

}
}