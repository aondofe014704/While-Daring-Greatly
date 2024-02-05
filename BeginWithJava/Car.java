public class Car{

private int doors;
private int wheels;
private String model;
private String engines;
private String colour;


public void setModel(String model){
	String validModel = model.toLowerCase();
	if(validModel.equals("Carrera") || validModel.equals("Commodore")){

}
	this.model = model;  

}else{
	this.model = "unknow ";
}

public String getModel(){

	return this.Model;
} 
}