package com.stackroute.pe4;

import java.util.Arrays;

public class AlphabeticSorting
{
    public String alphabeticSorting(String query)
    {
        String[] words=query.split(" ");//split the string to words.//
        Arrays.sort(words);//sort the words.//

        String result="";//intialize an empty string.//
        for(int i=0;i<words.length;i++)
        {
            result+=words[i]+" ";//concatinate sorted words.//
        }

        return result;//return the new string.//
    }
}
