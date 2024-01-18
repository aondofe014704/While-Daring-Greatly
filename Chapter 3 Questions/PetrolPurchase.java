public class PetrolPurchase{

private String location;

private String petrolType;

private int quantity;

private double pricePerLitre;

private double percentageDiscount;

public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLitre, double percentageDiscount){

	this.location = location;

	this.petrolType = petrolType;

	this.quantity = quantity;

	this.pricePerLitre = pricePerLitre;

	this.percentageDiscount = percentageDiscount;


}

public double getPurchaseAmount(){
	double value = (quantity * pricePerLitre) - percentageDiscount;
	
	return  value;

}


public void setLocation(String location){
	this.location = location;

}

public void setPetrolType(String petrolType){
	this.petrolType = petrolType;
}
public void setQuantity(int quantity){
	this.quantity = quantity;

}
public void setPricePerLitre(double pricePerLitre){
	this.pricePerLitre = pricePerLitre;
}

public void setPercentageDiscount(double percentageDiscount){
	this.percentageDiscount = percentageDiscount;
}

public String getLocation(){
	return location;
}
public String getPetrolType(){
	return petrolType;
}
public int getQuantity(){
	return quantity;
}
public double getPricePerLitre(){
	return pricePerLitre;
} 
public double getPercentageDiscount(){
	return percentageDiscount;
}
}