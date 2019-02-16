/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.vrany.coder.Entities;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michal
 */
public class AlphabetCoderTest {
    
    public AlphabetCoderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class AlphabetCoder.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        AlphabetCoder instance = new AlphabetCoder("testName", null, null);
        String expResult = "testName";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDesc method, of class AlphabetCoder.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        String expResult = "test description";
        AlphabetCoder instance = new AlphabetCoder(null, expResult, null);
        String result = instance.getDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of encode method, of class AlphabetCoder.
     */
    @Test
    public void testEncode() {
        System.out.println("encode");
        String input = "A";
        AlphabetCoder instance = new AlphabetCoder(null, null, new String[][] {
            new String[] { "A", ".-", "akát"}
        });
        String expResult = ".-";
        String result = instance.encode(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of decode method, of class AlphabetCoder.
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        String input = ".-";
        AlphabetCoder instance = new AlphabetCoder(null, null, new String[][] {
            new String[] { "A", ".-", "akát"}
        });
        String expResult = "A";
        String result = instance.decode(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDirectCodePage method, of class AlphabetCoder.
     */
    @Test
    public void testGetDirectCodePage() {
        System.out.println("getDirectCodePage");
        AlphabetCoder instance = new AlphabetCoder(null, null, new String[][] {
            new String[] { "A", ".-", "akát"}
        });
        HashMap<String, String> expResult = new HashMap<>();
        expResult.put("A", ".-");
        HashMap<String, String> result = instance.getDirectCodePage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getReverseCodePage method, of class AlphabetCoder.
     */
    @Test
    public void testGetReverseCodePage() {
        System.out.println("getReverseCodePage");
        AlphabetCoder instance = new AlphabetCoder(null, null, new String[][] {
            new String[] { "A", ".-", "akát"}
        });
        HashMap<String, String> expResult = new HashMap<>();
        expResult.put(".-", "A");
        HashMap<String, String> result = instance.getReverseCodePage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDirectAdviceCodePage method, of class AlphabetCoder.
     */
    @Test
    public void testGetDirectAdviceCodePage() {
        System.out.println("getDirectAdviceCodePage");
        AlphabetCoder instance = new AlphabetCoder(null, null, new String[][] {
            new String[] { "A", ".-", "akát"}
        });
        HashMap<String, String> expResult = new HashMap<>();
        expResult.put("A", "akát");
        HashMap<String, String> result = instance.getDirectAdviceCodePage();
        assertEquals(expResult, result);
    }
    
}
