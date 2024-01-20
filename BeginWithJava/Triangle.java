import java.util.Scanner;

public class Triangle{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the hypotenuse side");
int hypotenuse = scanner.nextInt();

System.out.println("Enter the opposite side");
int opposite = scanner.nextInt();

System.out.println("Enter the adjacent side");
int adjacent = scanner.nextInt();

int sumOfATriangle = hypotenuse + opposite + adjacent; 

if(sumOfATriangle == 180){
	System.out.println("The triangle size is valid");
}else{
System.out.println("not a valid triangle size");
}

}

}