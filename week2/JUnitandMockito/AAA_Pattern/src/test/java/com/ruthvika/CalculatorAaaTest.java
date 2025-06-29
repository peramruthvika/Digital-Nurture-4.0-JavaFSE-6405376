package com.ruthvika;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAaaTest {

    private Calculator calculator;

    // Setup method (runs before each test)
    @Before
    public void setUp() {
        calculator = new Calculator(); // 🔧 Arrange common object
        System.out.println(">> Setup completed");
    }

    // Teardown method (runs after each test)
    @After
    public void tearDown() {
        calculator = null; // 🧹 Cleanup
        System.out.println("<< Teardown completed");
    }

    @Test
    public void testAddition() {
        // Arrange done in @Before

        // Act
        int result = calculator.add(10, 20);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        // Act
        int result = calculator.add(-5, -8);

        // Assert
        assertEquals(-13, result);
    }
}
