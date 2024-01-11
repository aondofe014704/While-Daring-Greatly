import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest{

	
	
	
	
	@Test
	public void testForLargestInt(){


		Example example = new Example();
		int[] numbers = {10, 15, 12, 30, 40, 34};
		
		int result = example.largestNumber(numbers);

		assertEquals(40, result);
		
		

}



}