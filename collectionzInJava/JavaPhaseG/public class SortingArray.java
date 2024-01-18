public class SortingArrayAscending{

public static void main(String[] args){


int[] myNumbers = {1, 2, 3, 4, 12, 2, 34, 67, 3, 9, 87, 1, 34, 56, 70, 54};


int highestElement = 0;

for(int i = 0; i < myNumbers.length; i++){
	if(myNumbers[i] > highestElement){
	highestElement = myNumbers[i];
}
}
System.out.print(myNumbers[i] + " ");
}

}