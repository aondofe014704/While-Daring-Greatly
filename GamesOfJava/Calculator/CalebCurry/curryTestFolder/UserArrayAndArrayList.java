import java.util.Arrays;

public class UserArrayAndArrayList{

public static void main(String[] args){

int[] grades1 = {1, 2, 3, 72, 5};
int[] grades2 = grades1;



if (grades1 == grades2){
System.out.println("Equal");
}
if(grades1.equals(grades2)){
System.out.println("Equal");

}
 
if(Arrays.equals(grades1, grades2)){
System.out.println("Equals finally ");
}
int[] grades = {1, 2, 3, 4, 5};

Arrays.fill(grades, 77);
System.out.println(Arrays.toString(grades));
}
String[] grades = new String[5];






}