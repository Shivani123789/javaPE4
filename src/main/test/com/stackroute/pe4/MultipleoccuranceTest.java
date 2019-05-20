package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MultipleoccuranceTest {
    Multipleoccurance multi;
    @Before
    public void setup()
    {
        //arrenge
        multi = new Multipleoccurance();
    }

    @After
    public void tearDown()
    {
        //arrenge
        multi = null;
    }


    @Test
    public void multipleoccur_string_counted()
    {
        String s1="She go seashells by seashore and go sea";
        String expected[]={"found_at:7-10","found_at:20-23","found_at:36-39"};
        System.out.println(Arrays.toString(expected));
        //System.out.println( multi.multipleoccur_string_counted(s1));
        assertArrayEquals(expected, multi.multipleoccur_string_counted(s1));
    }
}
