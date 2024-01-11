import java.util.Arrays;


public class SortingArrays{

public static void main(String[] args){

//int[] numbers = {5, 2, 3, -1, 0, 4, 1};

char[] characters = {'a', 'z', 'b', 'w', 'c', 'A', 'D', 'Z', 'C', 'R'};

int[] unicodes = {'z', 'x', 'c', 'v', 'b', 'l', 'r', 'e', 'A', 'Q', 'P','T', 'Y', 'O', 'K', 'G', '$', '*', ')', '@'};

//>>>>>>>point[] point = {new point(1, //2), >>>>>>>new point(3, 4), new //point(-1, -2)};

//Searching Arrays using the binary operator::

//The array should be sorted in an increasing //order

//int[] example = {1, 2, 3, 5, 6, 7}; 

int[] numbers = {5, 4, 3, 2, 1, 0, -1};

Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));
System.out.println(Arrays.binarySearch(numbers, 4));

System.out.println(Arrays.binarySearch(numbers, -3));


System.out.println(Arrays.binarySearch(numbers, 6));




Arrays.sort(numbers);

Arrays.sort(characters);

Arrays.sort(unicodes);
// sorting a part of the array...
// we sort using the array, fromIndex, toIndex...: sort from(fromIndex toIndex -1)

int[] myNumberzzz = {5, 4, 3, 2, 1, 0, - 1};

Arrays.sort(myNumberzzz, 3, 7); 


//sorting arrays of objects... characters

String[] myStrings = {"hij", "abc", "efg"};
Arrays.sort(myStrings);

Arrays.sort(myStrings);



System.out.println(Arrays.toString(myStrings));
System.out.println(Arrays.toString(myNumberzzz));
//System.out.println(Arrays.toString(numbers));

//System.out.println(Arrays.toString(characters));
//System.out.println(Arrays.toString(unicodes));


}

}