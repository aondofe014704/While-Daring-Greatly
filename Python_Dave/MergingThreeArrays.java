
import java.util.Arrays;
public class MergingThreeArrays{

public static void main(String[] args){

int[] myFirstNumber = {1, 2, 3, 4, 5};

int[] mySecondNumber = {6, 7, 8, 9, 10};

int[] myThirdNumber = {11, 12, 13, 14, 15};


int[] myFouthNumber = new int[myFirstNumber.length + mySecondNumber.length + myThirdNumber.length];

for(int i = 0; i < myFirstNumber.length; i++){
	myFouthNumber[i] = myFirstNumber[i];
}

for(int i = 0; i < mySecondNumber.length; i++ ){
	myFouthNumber[myFirstNumber.length +mySecondNumber.length + i ] = mySecondNumber[i];
}

for(int i = 0; i < myThirdNumber.length; i++){
	myFouthNumber[myFirstNumber.length + mySecondNumber.length + myThirdNumber + i ]  = myThirdNumber[i]; 
}

System.out.println(Arrays.toString(myFouthNumber));
}

}