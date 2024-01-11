import java.util.Scanner;
public class AbsoluteValue{

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number value");

int myValue = scanner.nextInt(); 

if(myValue < 0){
myValue = myValue * -1;

}else if(myValue >= 0){
myValue = myValue * 1;

}

System.out.printf("the absolute value is %d: ", myValue);

}


}
