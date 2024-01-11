
import java.util.Arrays;

public class AdditionOfTwoIntegers{

public static void main(String[] args){

int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

int[] newNumbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


int[] numbersOfNumbers = new int[numbers.length + newNumbers.length];


int counter = 0;

for(int n = 0; n < numbers.length; n++ ){

numbersOfNumbers[counter] = numbers[n];

counter++;


}




for(int n = 0; n < newNumbers.length; n++){

numbersOfNumbers[counter] = newNumbers[n];

counter++;

}

System.out.println(Arrays.toString(numbersOfNumbers));
}






}