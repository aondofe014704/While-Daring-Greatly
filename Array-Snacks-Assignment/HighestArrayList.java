public class HighestArrayList{

public static void main(String[] args){

HighestArrayList jackson = new HighestArrayList();

int[] myArray = {1, 8, 3, 6, 90, 12, 45, 89, 98, 39};

jackson.highestElement(myArray);

int result = jackson.highestElement(myArray);

System.out.println(result);






}

public int highestElement(int[] myArray){

int highest = 0;

for(int i = 0; i < myArray.length; i++){

if(myArray[i] > highest){

highest = myArray[i];

}

}
return highest;

}

}