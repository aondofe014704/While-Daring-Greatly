import java.util.Scanner;
public class Calculator{
public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.print("1- > Addition \n " + "2->Subtraction \n" + "3->Division \n" + "4->Multiplication \n");
int calculatorOption = input.nextInt();
switch(calculatorOption){
case 1:System.out.print("welcome to Addition");
int total = 0;
System.out.print("How many numbers did you want to add : ");
int counter = input.nextInt();
for(int count = 0; count < counter; count++){
System.out.print("");
}
total = total + number;

System.out.print("Enter first number:");
int number1 = input.nextInt();

System.out.print("Enter second number: ");
int number = input.nextInt();
int result = number1 + number2;
System.out.print("Answer is: " + result);

case 2: System.out.println("Welcome Subtraction");
int total = 0;
for (int count = 0; count <5; count++){
System.out.print("Enter number" + (count +1) + ":");
int number = input.nextInt();
total = total + number;
}
}

}

}