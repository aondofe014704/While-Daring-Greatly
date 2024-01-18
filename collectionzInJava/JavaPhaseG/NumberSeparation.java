
import java.util.Scanner;
public class NumberSeparation{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter 5 digits number");

int output = input.nextInt();

int firstNumber = output % 10;

int numb1 = output / 10;

int secondNumber = numb1 % 10;

int numb2 = numb1 / 10;

int thirdNumber = numb2 % 10;

int numb3 = numb2 / 10;

int fourthNumber = numb3 % 10;

int numb4 = numb3 / 10;

int fifthNumber = numb4 % 10;

System.out.printf("%d%d%d%d%d",firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber );




  







}




}
