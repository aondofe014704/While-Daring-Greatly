import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class TryAgain{

	@Test
	public void testForLargestInt();

	
 	TryAgain tryAgain = new TryAgain();
	
	int[] numberOfArrayElements = {12, 43, 19, 45, 18, 10, 20};	
	int resultOfArrays = 	tryAgain.largestNumber(numberOfArrayElements);	


	assertEquals(45, resultOfArrays);


}