import java.util.Arrays;
public class MergeTwoArrays{

public static void main(String[] args){


int[] firstMerge = {1, 2, 3, 4, 5};

int[] secondMerge = {6, 7, 8, 9, 10};

int[] theRealArray = new int[firstMerge.length + secondMerge.length];

for(int i = 0; i < firstMerge.length; i++){

	theRealArray[i] = firstMerge[i];

}

for(int i = 0; i < secondMerge.length; i++){
	
	theRealArray[i + firstMerge.length] = secondMerge[i];


}

System.out.println(Arrays.toString(theRealArray));
}

}