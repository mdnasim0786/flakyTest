package flakyTest;

import java.lang.Math;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void test() {
        int num = (int) (Math.random()*(4-2+1)+2);
        assertEquals(num,2);
    }
}