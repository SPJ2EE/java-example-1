package sp.lesson;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1,1);
        Assert.assertEquals(2, calculator.getResult());
    }
}