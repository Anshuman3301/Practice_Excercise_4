package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;

public class TransposeSentenceTest {

    TransposeSentence ob;
    @Before
    public void setUp() throws Exception {
        ob=new TransposeSentence();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("After Class");
    }

    @Test
    public void givenANonEmptyStringReturnsItsTranspose()
    {
        String query="asd fgh jkl";
        String result=ob.transposeOfSentence(query);
        assertEquals("dsa hgf lkj", result);
    }
}