import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestTest {

    /*
    @Before
    public void setUp(){
        Calculator calculator = new Calculator(3,5);
    }*/
    @Test
    void testAddition() {
        Calculator calculator = new Calculator(3, 5);
        assertEquals(8, calculator.addition(3,5));
    }

    @Test
    void subtraction() {
        Calculator calculator = new Calculator(3, 5);
        assertEquals(-2, calculator.subtraction(3, 5));
    }

    @Test
    void multiplication() {
        Calculator calculator = new Calculator(3, 5);
        assertEquals(15, calculator.multiplication(3, 5));
    }

    @Test
    void division() {
        Calculator calculator = new Calculator(12, 4);
        assertEquals(3, calculator.division(12, 4));
    }






}