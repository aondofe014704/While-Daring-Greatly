import java.util.Scanner;
public class DriversMileage{

public static void main(String[] args){

Scanner gasMileage = new Scanner(System.in);


int count = 1;
int flagValue = 0;
double milesDrivenPerTrip = 0;
double averageCombinedMiles = 0;


while(flagValue != -1){

System.out.print("Enter mile "+ (count) + " driven: ");
int milesDriven = gasMileage.nextInt();

System.out.print("Enter gallon " + (count) + " Used: ");

int gallonsUsed = gasMileage.nextInt();

milesDrivenPerTrip = (double)milesDriven/gallonsUsed;

averageCombinedMiles+=milesDrivenPerTrip;


System.out.printf("the miles driven per gallon for this trip is %.2f%n", milesDrivenPerTrip);

System.out.println("press -1 to Quit or 2 to continue:  ");
flagValue = gasMileage.nextInt();

count++;

}


System.out.printf("The total miles driven per gallon for this trip is %.2f", averageCombinedMiles);



}



}