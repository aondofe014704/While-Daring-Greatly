import java.util.Scanner;

public class CorrectErrors{
public static void main(String[] args){

Scanner correctValue = new Scanner(System.in);
System.out.println("enter an integer to correct the errors");

int c = correctValue.nextInt();

if(c < 7){
System.out.println("c is less than 7");
}
if(c >= 7){
System.out.println("c is equal to or greater than 7");
}

}




}