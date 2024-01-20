import java.util.Scanner;
 public class LargestNumber{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("please Enter First integer");
int firstNumber = scanner.nextInt();

System.out.println("please Enter second integer");
int secondNumber = scanner.nextInt();

System.out.println("please Enter third integer");
int thirdNumber = scanner.nextInt();

if(firstNumber > secondNumber && firstNumber > thirdNumber){
System.out.println("The first number is the Highest :" +  firstNumber);

}else if(secondNumber > thirdNumber && secondNumber > firstNumber){
System.out.println("The second Number is the Highest :" +  secondNumber);

}else if(thirdNumber > firstNumber && thirdNumber > secondNumber){
System.out.println("The third number is the Highest :" +  thirdNumber);
}




}


}