package com.stackroute.pe4;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReplaceCharacterTest {


        public static ReplaceCharacter char1;

        @BeforeClass
        public static void setup()
        {
            //arrenge
            char1 = new ReplaceCharacter();

        }

        @AfterClass
        public static void teardown()
        {
            //arrenge
            char1 = null;

        }

        @Test
        public void characterreplaceTest_givenstring_ShouldString()
        {
            String s1 = "wonderful world";
            String actual=char1.replace(s1);
            String expected="vanderful varld";
            assertEquals(expected,actual);
        }
    }

