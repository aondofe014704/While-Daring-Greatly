

import java.util.Scanner;

public class ZeroNumbers{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

int numPositive = 0;
int numNegative = 0;
int numZero = 0;
int numCounter = 1;

System.out.println("Enter number");
int result = input.nextInt();

while(result != -1){
if(result  >= 1){
numPositive = numPositive + 1;
}

if(numNegative != 1){
numNegative = numNegative + 1;
}
if(result  == 0){
numZero = numZero + 1;
}

numCounter = numCounter + 1;
System.out.println("Enter number");
int result = input.nextInt();


}
System.out.printf("Positive:%d%nNegative:%d%nZeros:%d%n", numPositive, numNegative, numCounter);
}

}