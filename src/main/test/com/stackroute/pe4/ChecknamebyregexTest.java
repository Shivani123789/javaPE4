package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChecknamebyregexTest {
    Checknamebyregex name;

    @Before
    public void setup() {
        //arrenge
        name = new Checknamebyregex();
    }

    @After
    public void tearDown() {
        //arrenge
        name = null;
    }

    //  method is calling
    @Test
    public void checkbyregextrue_givenstring_checkedwordTest() {
        String s1 = "this is you";
        boolean expected = true;
        boolean actual=name.checkbyregex_givenstring_checkedword(s1);
        assertEquals(expected,actual );
    }

    @Test
    public void checkbyregextfalse_givenstring_checkedwordTest() {
        String s2 = "this is ";
        boolean expected = false;
        boolean actual=name.checkbyregex_givenstring_checkedword(s2);
        assertEquals(expected, actual);
    }

}