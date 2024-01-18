import java.util.Arrays;
public class MergeArrays{
public static void main(String[] args){

int[] myArrayOne = {1, 2, 3, 4, 5};

int[] myArrayTwo = {6, 7, 8, 9, 10};

int[] mergedArray = new int[ myArrayOne.length + myArrayTwo.length ]; 

for(int i = 0; i < myArrayOne.length; i++){

	mergedArray[i] = myArrayOne[i]; 
	
}

for(int i = 0; i < myArrayTwo.length; i++ ){
	mergedArray[i + myArrayOne.length ] = myArrayTwo[i];


}
System.out.println(Arrays.toString(mergedArray));

}



}