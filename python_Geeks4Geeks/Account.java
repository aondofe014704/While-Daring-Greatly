public class Account{

private String name;
private int balance; 
private String accountNumber;

public void setName(String name){
	this.name = name;
}

public void setAccountNumber(String accountNumber){
	this.accountNumber = accountNumber;
}

public String getName(){
	return name;
}
public int getBalance(){
	return balance;
}
public String getAccountNumber(){
	return accountNumber;
}

public void deposit(int amount){
	this.balance += amount;

}

}
