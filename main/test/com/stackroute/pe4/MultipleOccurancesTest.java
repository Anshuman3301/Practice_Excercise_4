package com.stackroute.pe4;

import org.junit.*;

import java.util.regex.Matcher;

import static org.junit.Assert.*;

public class MultipleOccurancesTest {

    MultipleOccurances ob;
    @Before
    public void setUp() throws Exception {
        ob=new MultipleOccurances();
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
    public static void afterClass()
    {
        System.out.println("After Class");
    }

    @Test
    public void givenAStringAndRegexReturnsItsOccurances()
    {
        String query="ab cab d";
        String reg="ab";

        assertEquals("Found at: 0-2\nFound at: 4-6",ob.multipleOccurances(query,reg));
    }
}