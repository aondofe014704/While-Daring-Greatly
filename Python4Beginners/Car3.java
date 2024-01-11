
public class Car3{

private String name;
private String color;
private int plateNumber;


public void setName(String name){
this.name = name;
}

public void setColor(String color){
this.color = color;
}

public void setPlateNumber(int plateNumber){
this.plateNumber = plateNumber;
}


public String getName(){
return name;
}

public String getColor(){
return color;
}

public int getPlateNumber(){
return plateNumber;
}


public void drive(){
System.out.println("Car is moving......");
}

public void honk(){
System.out.println("Car is honking pim pim");
}

public void stop(){
System.out.println("Car has stopped");
}
}