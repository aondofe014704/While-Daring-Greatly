import java.util.Arrays;

public class DescendingArray{

public static void main(String[] args){


int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

int[] myArray = new int[newArray.length];

for(int index = myArray.length-1; index >=0; index--){

	myArray[index] = newArray[index];


}
System.out.print(Arrays.toString(myArray));


}

}