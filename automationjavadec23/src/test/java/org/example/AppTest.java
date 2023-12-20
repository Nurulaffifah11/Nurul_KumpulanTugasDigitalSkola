package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest{

    @Test(testName = "verify 1 is 1 its true", description = "This test is for verify 1 is 1")
    public void testApp(){
        assertEquals(1,1);
    }


    @Test(testName = "verify 1 is 12 its false", description = "This test is for verify 1 is 2")
    public void shouldReturnFalse(){
        assertEquals(1,2);
    }
 }
