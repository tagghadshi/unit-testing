package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
// A-Arrange
// A-Act
// A-Assert	
	Calculator calculator;

	@BeforeEach
	void init() {
		calculator = new Calculator();// Arrange
		System.out.println("init");
	}

	@Test
	void testAdd() {
		int result = calculator.add(1, 3); // Act
		assertEquals(4, result, "Test Failed"); // Assert
	}

	@Test
	void testAddFloat() {
		float result = calculator.add(1.2F, 1.5F); // Act
		assertEquals(2.7, result, 0.000000047683716); // Assert
	}

	@Test
	void testAddBothNegativeInput() {
		float result = calculator.add(-1, -3); // Act
		assertEquals(-4, result); // Assert
	}

	@Test
	void testAddFloatWhereNumber1GreaterThan2() {
		float result = calculator.add(4.8F,5.1F); // Act
		assertEquals(9.9, result,0.899999618530273); // Assert
	}

	
	@Test
	void testAddOneNegativeInput() {
		float result = calculator.add(-1, 3); // Act
		assertEquals(2, result); // Assert
	}

	@Test
	void testDivide() {
		float result = calculator.divide(5, 2);
		assertEquals(2.5, result);
	}

	@Test
	void testWhenDenominatorIsZero() {
		try {
			calculator.divide(1, 0);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass());
		}
	}

	@Test
	void testWhenDenominatorIsGreaterThanDivisor() {
		float result = calculator.divide(2, 4);
		assertEquals(0.5, result);
	}
}
