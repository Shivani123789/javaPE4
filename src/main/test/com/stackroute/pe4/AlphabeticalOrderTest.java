package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

    public class AlphabeticalOrderTest
    {
        public static  AlphabeticalOrder object;
       // object is created here
        @BeforeClass
        public static void setup()
        {
            //arrenge
            object = new AlphabeticalOrder();

        }

        @AfterClass
        public static void teardown()
        {
            //arrenge
            object = null;

        }

        @Test
        public void sortingwords_ParaGiven_ShouldReturnSortedPara()
        {
            String p1 = "the pilots who have been hibernating during the winter months get their gliders out again";
          String[] expected = {"again", "been","during", "get", "gliders", "have", "hibernating", "months","out","pilots", "the", "the", "their","who","winter"};
            // method to sort word is called
           String [] actual=object.sortingwords(p1);
            assertArrayEquals(expected,actual);

        }

    }

