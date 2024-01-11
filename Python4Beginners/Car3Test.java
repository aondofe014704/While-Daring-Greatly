public class Car3Test{

public static void main(String[] args){

Car3 car3 = new Car3();


car3.setName("honda");

car3.setColor("white");

car3.setPlateNumber(112);


String color = car3.getColor();
int plateNo = car3.getPlateNumber();
String name = car3.getName();

car3.drive();
car3.honk();
car3.stop();

System.out.println(color);
System.out.println(plateNo);
System.out.println(name);
}
}