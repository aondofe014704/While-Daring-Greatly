public class LargestInElement{

public static void main(String[] args){

LargestInElement input = new LargestInElement();


int[] myArray = {1, 2, 90, 40, 38, 23, 45, 101, 120};

input.largestElement(myArray);

int answer = input.largestElement(myArray);

System.out.println(answer);




}

public int largestElement(int[] myArray){

	int highestElement = 0;
	
	for(int z = 0; z < myArray.length; z++){

	if(myArray[z] > highestElement){

	highestElement = myArray[z];
	
	}


}
	return highestElement;
}


}