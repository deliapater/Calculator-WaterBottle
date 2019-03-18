import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(3.00, 2.50);
    }

    @Test
    public void canAdd(){
        assertEquals(5.50, calculator.Add(), 0.00001);
    }

    @Test
    public void canSubtract(){
        assertEquals(0.50, calculator.Subtract(), 0.00001);
    }

    @Test
    public void canMultiply(){
        assertEquals(7.50, calculator.Multiply(), 0.00001);
    }

    @Test
    public void canDivide(){
        assertEquals(1.20, calculator.Divide(), 0.00001);
    }
}
