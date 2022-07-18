package flakyTest;

import java.lang.Math;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void test() {
        int num = (int) (Math.random()*(5-1+1)+1);
        assertEquals(num,2);
    }
}