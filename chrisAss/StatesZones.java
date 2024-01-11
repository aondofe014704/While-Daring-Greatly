import java.util.Scanner;

public class StatesZones{

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Select your State");
String state = scanner.next().equalsIgnoreCase();
string result =  switch(state){

case "kebbi", "sokoto", "katsina","kano","kaduna","zamfara":
System.out.println("You are from North West");


case "Borno", "Adamawa", "Yobe","Taraba","Gombe","Bauchi","Jigawa":
System.out.println("You are from North East");


case "Kogi", "Kwara", "plateau","Niger","Benue","FCT","Nassarawa":
System.out.println("You are from North Central");


case "Ogun", "Osun", "Ondo","Lagos","Ekiti","Oyo":
System.out.println("You are from South West");


case "Anambra", "Abia", "Enugu","Ebonyi","Imo":
System.out.println("You are from South East");

case "Rivers", "Akwa - Ibom", "Bayelsa","Delta","Cross - River","Edo":
System.out.println("You are from South South");





}


}


}