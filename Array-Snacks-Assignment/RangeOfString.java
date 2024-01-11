
import java.util.Arrays;
public class RangeOfString{

public static void main(String[] args){


String[] fruits = {"Mango","Banana", "Pawpaw", "Arches"};

String[] fruits2 = {"Orange", "Pineapple", "Cashew", "Carrot"};


String[] result = new String[fruits.length + fruits2.length];

int count = 0;


for(int i = 0; i < fruits.length; i+=1){

result[count] = fruits[i];
count +=2;


}
int counter = 1;

for(int k = 0; k < fruits2.length; k++){

result[counter] = fruits2[k];
counter +=2;

}



System.out.print(Arrays.toString(result));
}







}