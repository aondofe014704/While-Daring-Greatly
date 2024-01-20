import java.util.Scanner;
public class PosiveNegativeZero{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number");

int positiveNumber = scanner.nextInt();
int negativeNumber = scanner.nextInt();
int zeroNumber = scanner.nextInt();

if(positiveNumber > 0){
	System.out.println("The input entered is a positive number");

}else if(negativeNumber < 0){
	System.out.println("The input entered is a negative number");

}else {
	System.out.println("The input entered is Zero based.");
}


}

}