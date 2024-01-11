import java.util.Arrays;

public class FillingArrays{

public static void main(String[] args){

int[] numbers = new int[8];
Arrays.fill(numbers, 3);

int[] numbers2 = new int[8];

Arrays.fill(numbers2, 3, 7, 5);

String[] Strings = new String[3];

Arrays.fill(Strings, "Hello");


System.out.println(Arrays.toString(numbers));

System.out.println(Arrays.toString(numbers2));

System.out.println(Arrays.toString(Strings));


}





}