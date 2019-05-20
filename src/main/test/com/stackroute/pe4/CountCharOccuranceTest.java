package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountCharOccuranceTest {

   public static CountCharOccurance countchar;


    @Before
    public static void setup()
    {
        //arrenge
        countchar = new CountCharOccurance();
    }

    @After
    public static void tearDown()
    {
        //arrenge
        countchar = null;
    }
//  method is calling
    @Test
    public void countchar_string_countednumberTest()
    {
        String s1="java is a good programming language";
        // countcharacter method is called
    int actual=countchar.countchar_string_countednumber(s1);
    assertEquals(5,actual);
    }


}
