package com.stackroute.pe4;

public class ReplaceCharacter {

        public String replace(String str)
        //method to replace perticular character
        {
            String result = str.replaceAll("w", "v").replaceAll("o", "a");
            return result;
            //result return
        }
    }

