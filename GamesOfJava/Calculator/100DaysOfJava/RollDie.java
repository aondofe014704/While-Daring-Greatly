import java.security.SecureRandom;

public class Rolldie{
public static void main(String[] args){

SecureRandom randomNumbers = new SecureRandom();

int[] frequency = new int[7];
for(int roll = 1; roll <= 60_000_000; roll++){

++frequency[1 + randomNumbers.nextInt(6)];
}
System.out.printf("%4d%10d%n", face, frequency [face]);
}
}