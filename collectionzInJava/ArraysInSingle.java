import java.util.Arrays;

public class ArraysInSingle{

public static void main(String[] args){


int[] myNumbers = new int[6];

myNumbers[0] = 22;
myNumbers[1] = 8;
myNumbers[2] = 2;
myNumbers[3] = 0;
myNumbers[4] = 1;
myNumbers[5] = 6;

for (int i = 0; i < myNumbers.length; i++)
	System.out.print(myNumbers[i] + " ");



//The above Array is thesame thing as the code below....

int[] myNumzz = {6, 1, 0, 2, 8, 5};


for (int k = 0; k < myNumzz.length; k++)
System.out.println(myNumzz[k] + " ");


double[] numbers = new double[4];
numbers[0] = 2.4;
numbers[1] = 8.9;
numbers[2] = 1.5;
numbers[3] = 90.6;

double[] numbas = {2.4, 8.9, 1.5, 90.6};


myNumzz[0] = 10; 
myNumzz[2] = 88;

System.out.println(Arrays.toString(myNumbers));

System.out.println(Arrays.toString(myNumzz));

System.out.println(Arrays.toString(numbas));

System.out.println(Arrays.toString(numbers));





}



}