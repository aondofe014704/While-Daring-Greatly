public class HigherNumber{

public static void main(String[] args){

HigherNumber browny = new HigherNumber();

int[] myArrays = {8, 90, 12, 400, 7000, 390, 2459, 22222, 58790, 7};

browny.characterNumber(myArrays);

int result = browny.characterNumber(myArrays);

System.out.println(result);







}

public int characterNumber(int[] myArrays){

int highestNumber = 0;

for(int j = 0; j < myArrays.length; j++){

if(myArrays[j] > highestNumber){

highestNumber = myArrays[j];

}

}

return highestNumber;
}





}