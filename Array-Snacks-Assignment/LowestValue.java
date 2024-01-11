public class LowestValue{

public static void main(String[] args){

LowestValue lowArray = new LowestValue();


int[] deeArray = {5, 76, 43, 8, 9, 56};

// lowArray.lowestValueArray;

int issue = lowArray.lowestValueArray(deeArray);

System.out.println(issue);







}
public int lowestValueArray(int[] deeArray){

int lowestArray = deeArray[0];

for(int i = 0; i < deeArray.length; i++){

if(deeArray[i] < lowestArray){

lowestArray = deeArray[i];

}

}
	return lowestArray;
}
}