public class Account{

	private String name;
	private double balance;


public void setName(String name){
	this.name = name;
} 
public void setBalance(double balance){
	this.balance = balance;
}
public void setDeposit(double deposit){
	balance = deposit + balance;	
}
public void setwithdrawal(double withdrawal){
	

if(withdrawal > balance){
	System.out.println("Insuffient Balance");
}


if (balance > withdrawal){

balance = balance - withdrawal;
}

}
public String getName(){
	return name;
}
public double getBalance(){
	return balance;
}
public double getWithrawal(){

	return balance;
}




}