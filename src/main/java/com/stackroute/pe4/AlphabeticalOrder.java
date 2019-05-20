package com.stackroute.pe4;

public class AlphabeticalOrder {
   // method to sort woers of string in alphabetically
    public String[] sortingwords(String p1)
    {
        String[] splitedword;
        splitedword = p1.split("\\s");
        //splits the string

        for (int i = 0; i < splitedword.length; i++)
        {
            for (int j = i + 1; j < splitedword.length; j++)
            {
                if (splitedword[i].compareTo(splitedword[j]) > 0)
                {
                    String temp = splitedword[i];
                    splitedword[i] = splitedword[j];
                    splitedword [j] = temp;
                }
            }
        }
        return splitedword;
        // return splited word
    }
}
