package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindName
{
    public boolean ifNamePresent(String query, String name)
    {
        Pattern pattern=Pattern.compile(name);//create a regular expression of the name.//
        Matcher matching=pattern.matcher(query);//create an object to check if it is presnt.//

        return matching.find();//return result.//
    }
}
