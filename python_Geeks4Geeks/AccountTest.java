public class AccountTest{

public static void main(String[] args){


Account account = new Account();

account.setName("Jack Songu");
account.setAccountNumber("8698");
account.deposit(10000);
double withdrawnAmount = account.withdraw(50000);
account.getBalance();

String accountNumber = account.getAccountNumber();
String accountName = account.getName();



double accountBalance = account.getBalance();
System.out.printf("The account number is %s%n ", accountNumber);
System.out.printf("The account Name is %s%n ", accountName);
System.out.printf("The New account balance is %f%n", accountBalance);

}

} 