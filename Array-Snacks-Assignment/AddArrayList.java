public class AddArrayList{

public static void main(String[] args){

AddArrayList jack = new AddArrayList();

int[] plusArrays= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

int sumArrays = jack.additionArrays(plusArrays);

System.out.println( sumArrays);


}



public int additionArrays(int[] plusArrays){

int sumTotal = 0;

for(int i = 0; i < plusArrays.length; i++){

sumTotal += plusArrays[i];

} 
return sumTotal;

}
	
}