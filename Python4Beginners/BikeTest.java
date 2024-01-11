public class BikeTest{

public static void main(String[] args){

Bike bike =  new Bike();

bike.setName("Power Bike");
bike.setColor("Yellow");
bike.setEngineNumber(20212);

String bikesName = bike.getName();
int bumber1 = bike.getEngineNumber();
String bumber2 = bike.getColor();
 
System.out.println(bikesName);
System.out.println(bumber1);
System.out.println(bumber2);
}

}