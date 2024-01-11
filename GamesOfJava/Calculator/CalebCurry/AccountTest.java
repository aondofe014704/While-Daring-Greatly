public class AccountTest{

public static void main(String[] args){

Account account = new Account();

account.setName("Jack Songu");

account.setBalance(100_000);





System.out.printf("Your Name is:%s%n", account.getName());



System.out.printf("Your initial Balance is:%s%n", account.getBalance());


account.setDeposit(50_000);
account.setDeposit(30_000);


System.out.printf("Your new Balance is: %s%n", account.getBalance());

account.setwithdrawal(50_000);
account.setwithdrawal(120_000);
account.setwithdrawal(30_000);

System.out.println(account.getBalance());




}



}