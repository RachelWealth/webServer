package com.test_driven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws Exception
     */
    @Test
    public void shouldAnswerWithTrue() throws Exception
    {
        StringCalculator sc = new StringCalculator();
        //assertTrue( true );
        assertEquals(5,sc.add("2,3"));
        assertEquals(6,sc.add("1\n2,3"));
        
    }
}
