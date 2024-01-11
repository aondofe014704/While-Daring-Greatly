import java.util.Scanner; 
public class CreditLimitCalculator{

public static void main(String[] args){

Scanner calculator = new Scanner(System.in);


System.out.println("Enter Your Account Number");
String  accountNumber = calculator.nextLine();


System.out.println("Enter Initial Balance");
int initialBalance = calculator.nextInt();


System.out.println("total items charged");
int itemsCharged = calculator.nextInt();


System.out.println("total credits applied to your account");
int totalCreditAppliedToYourAccount = calculator.nextInt();


int newBalance =  initialBalance + itemsCharged - totalCreditAppliedToYourAccount;
 
System.out.println("Your new Balance is : " + newBalance);

if(newBalance > totalCreditAppliedToYourAccount){
	System.out.println("Your are Good to go");
}
 else if(newBalance < totalCreditAppliedToYourAccount){
	System.out.println( "Credit limit exceeded");
}



}


}