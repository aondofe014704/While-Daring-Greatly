import java.util.Arrays;

public class DemoArray{

public static void main(String [] args){ 

int [] score = new int []{1,2,3,4,5};

int [] hold = new int[score.length];

int count;
int inverse = score.length-1;

for (count = 0; count < score.length; count++){

	hold[inverse] = score[count] * 10;

	inverse --;

  }
System.out.print(Arrays.toString(hold));

}
 }

