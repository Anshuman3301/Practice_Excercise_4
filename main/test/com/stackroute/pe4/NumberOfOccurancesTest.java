package com.stackroute.pe4;


import org.junit.*;

import static org.junit.Assert.*;

public class NumberOfOccurancesTest {
    NumberOfOccurances ob;

    @Before
    public void setUp() throws Exception {
        ob=new NumberOfOccurances();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("Before Class");
    }

    @AfterClass
    public static  void afterClass()
    {
        System.out.println("After Class");
    }

    @Test
    public void givenAStringReturnsNumberOfOccurances()
    {
        String query="aaaaaaaa";
        char c ='a';
        int result=ob.numberOfOccurances(query,c);
        assertEquals(8, result);
    }

    @Test
    public void givenAStringAndNonOccuringReturnsZero()
    {
        String query="aaaaaaa";
        char c ='b';
        int result=ob.numberOfOccurances(query,c);
        assertEquals(0, result);
    }

    @Test
    public void givenAnEmptyStringReturnsZero()
    {
        String query="";
        char c ='a';
        int result=ob.numberOfOccurances(query,c);
        assertEquals(0,result);
    }
}