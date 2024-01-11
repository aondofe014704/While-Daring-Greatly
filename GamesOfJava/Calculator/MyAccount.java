public class MyAccount{

private String name;

private double balance;

public void setName(String name){
this.name = name;
}

public String getName(){
return name;
}
public void deposit(double amount){
if(amount < 0) System.out.print("Invalid Deposit");
else{
this.balance = balance + amount;
}
}


public void withdrawal(double amount){
if(amount < 0 || amount > balance) System.out.print("Invalid withdrawal");
else{
this.balance = balance - amount;
}
}
public double checkBalance(){
return balance;
}
	}