package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;

public class ReplacingCharactersTest {
    ReplacingCharacters ob;

    @Before
    public void setUp() throws Exception {
        ob=new ReplacingCharacters();
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
    public void givenAStringReplaceAllCharacters()
    {
        String result=ob.replaceCharacters("dldldl");
        assertEquals("ftftft", result);
    }

    @Test
    public void givenAnEmptyStringReturnsError()
    {
        String result=ob.replaceCharacters("");
        assertEquals("String cannot be empty or null.", result);
    }


}