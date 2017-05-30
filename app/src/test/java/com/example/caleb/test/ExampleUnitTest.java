package com.example.caleb.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void validate() throws Exception{
        assertTrue(!MainActivity.checkPassword("passwordUp1"));
    }

    @Test
    public void checkLength() throws Exception{
        assertTrue(!MainActivity.checkPassword("12345678Up!"));
    }

    @Test
    public void checkDigit() throws Exception{
        assertTrue(!MainActivity.checkPassword("12345678Up!"));
    }

    @Test
    public void checkUpperandLower() throws Exception{
        assertTrue(!MainActivity.checkPassword("UPPLoopw!"));
    }

    @Test
    public void checkSpecialchar() throws Exception{
        assertTrue(!MainActivity.checkPassword("UPPLoopw!"));
    }
}