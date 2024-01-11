public class AirConditionTest{
public static void main(String[] args){

AirCondition aircondition = new AirCondition();

aircondition.setName("Samsung");
aircondition.setModel("Hitman");
aircondition.setEngineNumber(23);


aircondition.getName();



System.out.printf("The name of the AC is: %s", aircondition.getName());


}
}