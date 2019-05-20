package com.stackroute.pe4;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransposeGivenStringTest{
   public static TransposeGivenString trans;

        @BeforeClass
        public static void setup()
        {
            //arrenge
            trans = new TransposeGivenString();

        }

        @AfterClass
        public static void teardown()
        {
            //arrenge
            trans = null;

        }

        @Test
        public void transposeString_GivenString_ReturnTransposeString()

        {

            String s1="my name is shivani pawar";
            String expected="ym eman si inavihs rawap ";
            String actual=trans.transposeString(s1);
            // called method to transpose the string
            assertEquals(expected,actual);

        }

    }


