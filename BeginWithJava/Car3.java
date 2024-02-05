public class Car3{

private static int a = 17;
private static int b = 34;

public static void main(String[] args){

int my_Result = myFunction(a , b);

System.out.println(my_Result);

}

public static int myFunction(int a, int b){

return Math.max(a, b);

}
}