import java.util.Arrays;

public class comparingArrays{
public static void main(String[] args){

int[] numbers1 = {5, 4, 3, 2, 1, 0, -1};
int[] numbers2 = {5, 4, 3, 2, 1, 0, -1};
int[] numbers3 = {1, 2, 3, 7, 7, 8, 1};

String[] String1 = {"a", "b", "c"};

String[] String2 = {"a", "b", "c"};



System.out.println(numbers1 == numbers2);
System.out.println(Arrays.equals(numbers1, numbers2));

System.out.println(Arrays.equals(numbers1, numbers3));
System.out.println(String1 == String2);
System.out.println(Arrays.equals(String1, String2));


}

}