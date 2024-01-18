public class PetrolPurchaseTwoTest{

public static void main(String[] args){

PetrolPurchaseTwo petrolAccount = new PetrolPurchaseTwo("Adikpo", "Kerosene", 10, 68.98, 2.7);

petrolAccount.getStationLocation();

petrolAccount.getTypeOfPetrol();

petrolAccount.getPetrolQuantity();

petrolAccount.getPricePerLitre();

petrolAccount.getPercentageDiscount();


System.out.printf("%s %s %d %f %f", petrolAccount.getStationLocation(), petrolAccount.getTypeOfPetrol(), petrolAccount.getPetrolQuantity(), petrolAccount.getPricePerLitre(), petrolAccount.getPercentageDiscount());

}
}