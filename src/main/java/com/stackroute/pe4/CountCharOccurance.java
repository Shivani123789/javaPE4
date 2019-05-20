package com.stackroute.pe4;

public class CountCharOccurance {
    //method to check count
   public int countchar_string_countednumber(String str)
   {
       int charcount = str.length() - str.replaceAll("g", "").length();
       System.out.println("g character is occured in string is: " + charcount);
       return charcount;
       // total counted char is return;
   }
}
