import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

public class BasicMathTest {

    BasicMath math = new BasicMath();
    public int result;


    @Before
    public void setUp() throws Exception {
        System.out.println("Setup Completed");
    }

    @Test
    public void testAddNormalCase(){
        result = math.add(50, 50);
        assertTrue(result == 100);
        System.out.println("Test result = "+result);
    }

    @Test
    public void testAddWithNegativeInts(){
        result = math.add(-5, -10);
        assertTrue(result == -15);
        System.out.println("Test result = "+result);
    }

    @Test
    public void testAddWithOneNegativeAndOnePositive(){
        result = math.add(-15, 10);
        assertTrue(result == -5);
        System.out.println("Test result = "+result);
    }

    @Test
    public void testSubtractNormalCase(){
        result = math.subtract(100, 50);
        assertTrue(result == 50);
        System.out.println("Test result = "+result);
    }

    @Test
    public void testSubtractWithNegativeInts(){
        result = math.subtract(-50, -200);
        assertTrue(result == 150);
        System.out.println("Test result = "+result);
    }

    @Test
    public void testSubtractWithOneNegativeAndOnePositive(){
        result = math.subtract(-100, 50);
        assertTrue(result == -150);
        System.out.println("Test result = "+result);
    }

    @Test
    public void testMultiplyNormalCase(){
        result = math.multiply(50, 4);
        assertTrue(result == 200);
        System.out.println("Test result = "+result);
    }

    @Test
    public void testMultiplyWithNegativeInts(){
        result = math.multiply(-5, -10);
        assertTrue(result == 50);
        System.out.println("Test result = "+result);
    }

    @Test
    public void testMultiplyWithOneNegativeAndOnePositive(){
        result = math.multiply(5, -25);
        assertTrue(result == -125);
        System.out.println("Test result = "+result);
    }

    @Test
    public void testDivisionNormalCase(){
        result = math.division(25, 4);
        assertTrue(result == 6);
        System.out.println("Test result = "+result);
    }

    @Test
    public void testDivisionWithNegativeInts(){
        result = math.division(-50, -5);
        assertTrue(result == 10);
        System.out.println("Test result = "+result);
    }


    @Test
    public void testDivisionWithOnePositiveAndOneNegative(){
        result = math.division(-10, 5);
        assertTrue(result == -2);
        System.out.println("Test result = "+result);
    }

    @After
    public void tearDown() throws Exception{
        System.out.println("Teardown Complete.");
    }


}
