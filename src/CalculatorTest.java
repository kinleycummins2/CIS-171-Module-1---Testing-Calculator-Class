import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
    Calculator calc = new Calculator();

    //Test for adding positive numbers
    @Test
    public void testAddPositives()
    {
        assertEquals(5, calc.add(3, 2), "3 + 2 should be 5");
    }

    //Test for adding a positive and a negative number
    @Test
    public void testAddPositiveAndNegative()
    {
        assertEquals(3, calc.add(5, -2), "5 + -2 should be 3");
    }

    //Test for adding two negative numbers
    @Test
    public void testAddNegatives()
    {
        assertEquals(-15, calc.add(-10, -5), "-10 + -5 should be -15");
    }

    //Test for subtracting two positives
    @Test
    public void testSubtractPositives()
    {
        assertEquals(3, calc.subtract(5, 2), "5 - 2 should be 3");
    }

    //Test for subtracting a positive and a negative number
    @Test
    public void testSubtractPositiveAndNegative()
    {
        assertEquals(-12, calc.subtract(-10, 2), "-10 - 2 should be -12");
    }
    //Test for subtracting two negatives
    @Test
    public void testSubtractNegatives()
    {
        assertEquals(0, calc.subtract(-4, -4), "-4 - -4 should be 0");
    }

    //Test for multiplying positives
    @Test
    public void testMultiplyPositives()
    {
        assertEquals(12, calc.multiply(3, 4), "3 * 4 should be 12");
    }

    //Test for adding a positive and a negative number
    @Test
    public void testMultiplyPositiveAndNegative()
    {
        assertEquals(-10, calc.multiply(5, -2), "5 * -2 should be -10");
    }

    //Test for multiplying negatives
    @Test
    public void testMultiplyNegatives()
    {
        assertEquals(12, calc.multiply(-6, -2), "-6 * -2 should be 12");
    }

    //Test for multiplying by 0
    @Test
    public void testMultiplyByZero()
    {
        assertEquals(0, calc.multiply(5, 0), "5 * 0 should be 0");
    }

    //Test for dividing positives
    @Test
    public void testDividingPositives()
    {
        assertEquals(2, calc.divide(4, 2), "4 / 2 should be 2");
    }
    //Test for dividing positive and negative numbers
    @Test
    public void testDividingPositiveAndNegative()
    {
        assertEquals(-2, calc.divide(10, -5), "10 / -5 should be -2");
    }
    //Test for dividing negatives
    @Test
    public void testDividingNegatives()
    {
        assertEquals(6, calc.divide(-12, -2), "-12 / -2 should be 6");
    }
    //Test for dividing by zero - expecting exception
    @Test
    public void testDividingByZeroThrowsException()
    {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0), "10 / 0 should throw an ArithmeticException");
    }





}