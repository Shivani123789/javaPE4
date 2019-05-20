package com.stackroute.pe4;

import java.io.BufferedReader;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Multipleoccurance {

    public String[] multipleoccur_string_counted(String str)
    //method to find multiple occurances
    {
            String regex = "sea";
            Pattern pattern = Pattern.compile(regex);
            // Created a matcher for the input String
            Matcher matcher = pattern.matcher(str);
            // this give the current matcher state
            MatchResult result = matcher.toMatchResult();
            System.out.println("Current Matcher: " + result);
            StringBuffer read = new StringBuffer("");
            while (matcher.find()) {

                read.append("found_at:" + matcher.start() + "-" + matcher.end() + "\n");
            }
            return read.toString().split("\n");
            // return result here
        }

    }
