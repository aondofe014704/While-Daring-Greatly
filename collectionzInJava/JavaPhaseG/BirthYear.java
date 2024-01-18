import java.util.Scanner;

public class BirthYear{
public static void main(String[] args){

System.out.println("Enter your birth year");

Scanner input = new Scanner(System.in);

int birthYear = input.nextInt();

int currentYear = 2024;

int age = currentYear - birthYear;

System.out.println(age);


}



}