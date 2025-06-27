package week2.JUnitandMockito.Setting_Up_JUnit.src.main.test.java.com.ruthvika;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
}
