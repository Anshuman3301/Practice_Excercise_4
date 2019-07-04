package com.stackroute.pe4;

public class ReplacingCharacters
{
    public String replaceCharacters(String query)
    {
        if (query.length() < 1)
        {
            return "String cannot be empty";
        }


        query=query.replace('d','f');//replace d with f.//
        query=query.replace('l','t');//replace l with t.//
        return query;//return the query.//
    }
}
