package com.stackroute.pe4;

public class TransposeGivenString
{
    public String transposeString(String str)
            //method to find transpose
    {
        String[] words = str.split("\\s");
        String transposed = "";
        for(String i:words)
        {
            StringBuilder sb = new StringBuilder(i);
            sb.reverse();
            transposed += sb.toString() + " ";
        }
        return transposed;
        //return transposed result
    }
}
