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
    public void validate1() throws Exception{
        assertTrue(!MainActivity.checkPW("password");
    }

    @Test
    public void validate2() throws Exception{
        assertTrue(MainActivity.checkLength("password"));
    }
}