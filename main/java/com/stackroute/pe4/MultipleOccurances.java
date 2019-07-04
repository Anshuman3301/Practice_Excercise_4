package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurances
{
    public String multipleOccurances(String query, String reg)
    {
        Pattern pattern=Pattern.compile(reg);//create an object for the regular expression.//
        Matcher matching=pattern.matcher(query);//create an object to call various functionality.//
        String result="";//intialize an empty string.//
        while(matching.find())//search till the pattern matches.//
        {
            result+="Found at: "+matching.start()+"-"+matching.end()+"\n";//concatinate according to the requirements.//
        }

        return result.substring(0, result.length()-1);//return eliminating last line.//
    }
}
