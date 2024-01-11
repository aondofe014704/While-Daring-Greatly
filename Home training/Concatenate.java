import java.util.Arrays;

public class Concatenate {

	public static void main (String[] args) {

	String[] fruit = {"mango", "banana", "pawpaw"};
	String[] fruit2 = {"orange", "pineapple", "cashew"};
	
	String[] answer = new String [fruit.length + fruit2.length];

	int counter = 0;

	for (int count = 0; count < fruit.length; count+=1) {
		answer [counter] = fruit [count];
		counter += 2;
	}
	
	int counter2 = 1;

	for (int count = 0; count < fruit2.length; count++) {
		answer [counter2] = fruit2[count];
		counter2 +=2 ;
	}

	System.out.print(Arrays.toString(answer));
	
	}

}