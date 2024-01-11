import java.util.Scanner;

public class MainAccount{

public static void main(String[] args){

Account worthWhile = new Account();

Scanner scanner = new Scanner(System.in);


System.out.println("Enter your name");
String name = scanner.nextLine();
worthWhile.setName(name);

System.out.println(worthWhile.getName());




}



}