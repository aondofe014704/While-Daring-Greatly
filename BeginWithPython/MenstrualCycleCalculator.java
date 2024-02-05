import java.util.Scanner;

public class MenstrualCycleCalculator{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("please what is your Name:");
String name = scanner.nextLine();


System.out.println("please what is your age:");
int userAge = scanner.nextInt();

System.out.println("which day was your last flow?:");

String lastFlowDay = scanner.nextLine();

lastFlowDay += 28;
ovulationTime = lastFlowDay / 2;
System.out.println("Your next period will be" + lastFlowDay);
System.out.println("Your ovulation time is + ovulationTime);






 










}

}