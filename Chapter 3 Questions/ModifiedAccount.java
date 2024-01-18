public class ModifiedAccount{

private String name;
private double balance;

public ModifiedAccount(String name, double balance){

	this.name = name;

if(balance > 0.0){

	this.balance = balance;

}

}

public void withdrawal(double withdrawalAmount){

if(withdrawalAmount > balance){

System.out.println("Withdrawal amount exceeded account balance.");

balance = balance - withdrawalAmount; 

}

}

public double getBalance(){

return balance;
}

public void setName(String name){
	this.name = name;

}
public String getName(){

return name;


}

}