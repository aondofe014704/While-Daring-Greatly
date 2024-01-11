import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestTest{


	@Test
	public void testIfThisCanGetALargestInt(){

	Largest large = new Largest();
	
	int[] myArray = {12, 34, 58, 12, 39, 50};
	
	large.largestNumber(myArray);
	int answer = large.largestNumber(myArray);
	assertEquals(58, answer);


	
}

}