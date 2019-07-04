package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;

public class FindNameTest {

    FindName ob;
    @Before
    public void setUp() throws Exception {
        ob=new FindName();
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
    public void givenAStringAndNameChecksIfNameIsPresent()
    {
        boolean result=ob.ifNamePresent("This is Harry","Harry");
        assertEquals(true,result);
    }
}