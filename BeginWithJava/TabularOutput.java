public class TabularOutput{

public static void main(String[] args){

	

System.out.printf("%s%10s%10s%10s%n ", "N ", "N2 ", "N3 ", "N4 ");

int t = 1;

for(int count = 0; count <5; count++){
	

System.out.printf("%d%10d%10d%10d%n ",t, t*t, t*t*t, t*t*t*t);
t++;
}




}




}