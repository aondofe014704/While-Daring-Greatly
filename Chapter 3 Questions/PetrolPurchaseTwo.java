public class PetrolPurchaseTwo{

private String stationLocation;
private String typeOfPetrol;
private int petrolQuantity;
private double pricePerLitre;
private double percentageDiscount;

public PetrolPurchaseTwo(String stationLocation, String typeOfPetrol, int petrolQuantity, double pricePerLitre, double percentageDiscount){

	this.stationLocation = stationLocation;
	this.typeOfPetrol = typeOfPetrol;
	this.petrolQuantity = petrolQuantity; 
	this.pricePerLitre = pricePerLitre;
	this.percentageDiscount = percentageDiscount;

}
public double getPurchaseAmount(){
double valueAmount = (petrolQuantity * pricePerLitre) - percentageDiscount;

	return valueAmount; 

} 

public void setStationLocation(String stationLocation){
	this.stationLocation = stationLocation;

}
public void setTypeOfPetrol(String typeOfPetrol){
	this.typeOfPetrol = typeOfPetrol;
}
public void setPetrolQuantity(int petrolQuantity){
	this.petrolQuantity = petrolQuantity;
}
public void setPricePerLitre(double pricePerLitre){
	this.pricePerLitre = pricePerLitre;
}
public void setPercentageDiscount(double percentageDiscount){
	this.percentageDiscount = percentageDiscount;
}


public String getStationLocation(){
	
	return stationLocation; 
}
public String getTypeOfPetrol(){
 	return typeOfPetrol;
} 
public int getPetrolQuantity(){
	return petrolQuantity;
}
public double getPricePerLitre(){
	return pricePerLitre;
}
public double getPercentageDiscount(){
	return percentageDiscount;
} 






} 