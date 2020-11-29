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
    public void testAddition() {
        Calculator calculator = new Calculator(3, 5);
        assertEquals(8, calculator.addition(3,5));
    }








}