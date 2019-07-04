package com.stackroute.pe4;

public class TransposeSentence
{
    public String transposeOfSentence(String query)
    {
        String[] words=query.split(" ");//split the string to get the words.//
        String res="";//intialise an empty string.//

        for(int i=0;i<words.length;i++)
        {
            res+=reverse(words[i])+" ";//concatinate the reverse of the words with space in between.//
        }

        return res.trim();//return the string omitting the last space.//
    }

    public String reverse(String word)
    {
        String rev="";//initialise an empty string.//
        for(int i=word.length()-1;i>=0;i--)
        {
            rev+=word.charAt(i);//concatinate the characters in a reverse condition.//
        }

        return rev;//return the reverse.//
    }
}
