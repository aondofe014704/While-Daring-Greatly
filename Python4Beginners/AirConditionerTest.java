public class AirConditionerTest{

public static void main(String[] args){

AirConditioner airconditioner = new AirConditioner();


airconditioner.setColor("white");
airconditioner.setName("samsung air condition");
airconditioner.setModel(647);
airconditioner.setSwitchOff("Off");
airconditioner.setPowerOn("On");
airconditioner.setIncreaseTemperature(1 - 10);
airconditioner.setDecreaseTemperature();
String acName = airconditioner.getName();

 
int acModel = airconditioner.getModel();


 
System.out.println(acName);
System.out.println(acModel);
}

}