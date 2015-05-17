/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanip;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class ManipulatorTest {
    
    public ManipulatorTest() {
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
     * Test of Manipulate method, of class Manipulator.
     */
    @Test
    public void testManipulate() {
        System.out.println("Manipulate");
        Manipulator instance = new Manipulator("thing whole important problem");
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add(("tnihg"));
        expResult.add(("wlohe"));
        expResult.add(("inatropmt"));
        expResult.add(("pelborm"));
        ArrayList<String> result = instance.Manipulate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
