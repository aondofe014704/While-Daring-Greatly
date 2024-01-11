
import java.util.Arrays;

public class JoinedArray{

public static void main(String[] args){

String[] fruits = {"pawpaw", "orange", "guava", "pineapple" };

String[] newFruits = {"Beans", "carrots", "mango", "pearls"};

String[] fruitsOfFruits = new String[fruits.length + newFruits.length];

int k = 0;


for(int i = 0; i < fruits.length; i++ ){

fruitsOfFruits[k] = fruits[i];

k++;



}



for(int i = 0; i < newFruits.length; i++){

fruitsOfFruits[k] = newFruits[i];

k++;

}

System.out.println(Arrays.toString(fruitsOfFruits));


}






}