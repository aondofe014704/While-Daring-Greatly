public class PetrolPurchaseTest{

public static void main(String[] args){

PetrolPurchase account = new PetrolPurchase("Yaba", "Diesel", 10, 165.70, 1.5);



account.getLocation();

account.getPetrolType();

account.getQuantity();

account.getPricePerLitre();

account.getPercentageDiscount();

System.out.printf("%s %s %d %f %f", account.getLocation(),  account.getPetrolType(),account.getQuantity(), account.getPricePerLitre(), account.getPercentageDiscount());


}

}