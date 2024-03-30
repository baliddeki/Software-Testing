package ug.ac.mak.se23day;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void evaluateTest(){
        int sum = App.evaluate("2+3+4");
        assertEquals(9, sum);
    }
}
