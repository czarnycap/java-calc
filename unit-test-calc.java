import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(1, 2, '+');
        assertEquals(3, result, 0);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(5, 2, '-');
        assertEquals(3, result, 0);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(2, 3, '*');
        assertEquals(6, result, 0);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(6, 3, '/');
        assertEquals(2, result, 0);
    }

    @Test
    public void testInvalidOperator() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(6, 3, '%');
        assertEquals(Double.NaN, result, 0);
    }
}

