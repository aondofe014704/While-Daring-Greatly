
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{





		@Test
		public void testThatCalculatorCanAddTwoPosiveNumbers(){

			Calculator calculator = new Calculator();
			int sum = calculator.add(5, 6);
			assertEquals(11, sum);

	}
		@Test
		public void testThatCalculatorCanAddNegativeNumbers(){

		Calculator calculator = new Calculator();
		int sum = calculator.add(-3, -2);
		System.out.println("sum: " + sum);
		assertEquals(-5, sum);


	
}
		@Test
		public void testThatCalculatorCanMutiply(){

		Calculator calculator = new Calculator();
		int product = calculator.multiply(3, 5);
		assertEquals(3, product);
		
}




}