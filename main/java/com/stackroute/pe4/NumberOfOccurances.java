package com.stackroute.pe4;

public class NumberOfOccurances
{
    public int numberOfOccurances(String query, char c)
    {

        if(query.equals(""))
        {
            return 0;//if query is not there return 0.//
        }

        int oldLength=query.length();//find the old length of the string.//

        query=query.replaceAll(String.valueOf(c),"");//replace all the characters with empty characters.//

        int newLength=query.length();//find the new length.//

        return oldLength-newLength;//return the difference.//
    }
}
