
import java.util.Arrays;
import java.util.Scanner;

public class CreditCardValidator{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Hello, Kindly Enter Card details to verify");

String validator = input.nextLine();

int[] accountNumber = new int[validator.length()];

for(int i = 0; i < validator.length(); i++){

accountNumber[i] = Character.getNumericValue(validator.charAt(i));

}

int[] doubleValidator = new int[accountNumber.length / 2];

int inputvalue = 0;

for(int i = validator.length()-2; i <= 0;i -= 2){

doubleValidator[inputvalue] = accountNumber[i] * 2;

inputvalue++;

}

for(int chi = 0; chi < doubleValidator.length; chi++ ){

if(doubleValidator[chi] >= 10){

	doubleValidator[chi] = doubleValidator[chi] / 10 + doubleValidator[chi] % 10;
}


}

int evenTo = 0;

for(int findName = 0; findName < doubleValidator.length; findName++){

evenTo += doubleValidator[findName];

}

int oddTo = 0;
for(int findChi = 0; findChi < doubleValidator.length; findChi+=2){

oddTo += doubleValidator[findChi];
}

int sumResult = evenTo + oddTo;

System.out.println("****************************************");

if(sumResult % 10 ==0){

	System.out.println("***Credit Card Validity Status: Valid");

}else{

	System.out.println("***Credit Card Validity Status: InValid");

}

if(accountNumber[0] == 4){
System.out.println("***Credit Card Type: Visa");

}

if(accountNumber[0] == 5){
System.out.println("***Credit Card Type: MasterCard");

}
if(accountNumber[0] == 3 && accountNumber[1] == 7){
System.out.println("***Credit Card Type: American Express Card");

}
if(accountNumber[0] == 6){
System.out.println("***Credit Card Type: Discover Card");

}
	System.out.println("***Credit Card Number:"+ validator);

	System.out.println("***Credit Card Digit Length:" + accountNumber.length);

	System.out.println("***************************************");




































}


}