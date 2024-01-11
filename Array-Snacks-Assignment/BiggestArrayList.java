public class BiggestArrayList{

public static void main(String[] args){

BiggestArrayList Dee = new BiggestArrayList();


int arrayList[] = {2, 5, 7, 8, 9, 18, 4};

Dee.myArrayList(arrayList);

int enter = Dee.myArrayList(arrayList);

System.out.println(enter);




}
public int myArrayList(int[] arrayList){

int biggestArray = 0;

for(int i = 0; i < arrayList.length; i++ ){

if(arrayList[i] > biggestArray){

biggestArray = arrayList[i];

}


}
	return biggestArray;
}




}