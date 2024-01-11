import java.util.Scanner;
public class While_loop{
public static void main(String[] args){
Scanner jack = new Scanner(System.in);
System.out.println("Enter the limit : ");
int number = jack.nextInt();
int i = 1;
while(i<=number){
System.out.println(i);
number++;
}


}


}