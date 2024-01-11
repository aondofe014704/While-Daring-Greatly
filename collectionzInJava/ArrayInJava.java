import java.util.Arrays;

public class ArrayInJava{

public static void main(String[] args){

int[] myNumbers = new int[5];
myNumbers[0] = 1;
myNumbers[1] = 2;
myNumbers[2] = 3;
myNumbers[3] = 4;
myNumbers[4] = 5;

int[] myNumz = {7, 9, 0, 4, 6, 5, 6};

//two dimensional Arrays...

int[][][] dimensionalArrays = new int[2][3][5];
dimensionalArrays[0][0][2] = 5;

int[][] myArray = {{1,2, 3, 4}, {8,7, 9}};

Arrays.sort(myNumz);

System.out.println(Arrays.deepToString(dimensionalArrays));

System.out.println(myNumz.length);

System.out.println(myNumbers.length); 

System.out.println(Arrays.toString(myNumbers));
 
System.out.println(Arrays.deepToString(myArray));
System.out.println(Arrays.toString(myNumz));
}

 

}