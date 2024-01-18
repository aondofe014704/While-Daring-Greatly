import java.util.Scanner;

public class MultiplicatonTable{

public static void main(String[] args){

System.out.println("Enter a number for multiplication");

Scanner scanner = new Scanner(System.in);

int numberToMultiply = scanner.nextInt();

int counter = 1;

for(int count = 1; count < numberToMultiply; count++ ){

for(int counter = 1; counter < numberToMultiply; counter++ ){
	numberToMultiply +=  counter;
}

System.out.printf("%d%n%d%n",numberToMultiply, counter);

}






}



}