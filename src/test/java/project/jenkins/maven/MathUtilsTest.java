package project.jenkins.maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	private MathUtils mathUtils;
	
	@BeforeEach
	void initEach()
	{
		mathUtils = new MathUtils();
	}
	
	@Test
	@DisplayName("Addition")
	void testAdd() {
<<<<<<< HEAD
		assertEquals(2,mathUtils.add(1, 1),()-> "Should return correct Addition");
=======
		assertEquals(2,mathUtils.add(1, 1),()-> "Should return correct sum of numbers");
>>>>>>> 5cf2c48532d1c5e77f335675249c1741ade69f55
	}
	
	@Test
	@DisplayName("Substraction")
	void testSubstrat()
	{
		assertEquals(2,mathUtils.substract(4, 2),() -> "Should return correct substraction result!");
	}
}
