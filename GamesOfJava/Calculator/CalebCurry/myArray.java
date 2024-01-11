import java.util.Arrays;

public class MyArray{

public static void main(String[] args){

String[] myArrayList = new String[] {"Bag","Phone", "Laptop", "Guiter"};

for(int i = 0; i< myArrayList.length-1; i++){

if(myArrayList[i] == "Bag"){

System.out.println("the item is:" + myArrayList[i]);

System.out.println("the position of the item is:" +myArrayList [i]);
}
}
}
}