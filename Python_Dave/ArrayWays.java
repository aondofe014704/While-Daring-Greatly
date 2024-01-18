public class ArrayWays{

public static void main(String[] args){

String[] myNames = {"James", "Jack", "Caleb", "Jackson", "Mary", "Clark", "Songu"};

for(int names = 0; names < myNames.length; names++){
	
	System.out.print(myNames[names] + " ");
	System.out.println();
}

for(int namez = myNames.length - 1; namez >= 0; namez--){
	System.out.println();
	System.out.println(myNames[namez] + " ");
}  

}

}