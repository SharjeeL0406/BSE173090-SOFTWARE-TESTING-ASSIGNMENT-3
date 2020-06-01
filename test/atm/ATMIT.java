/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USMAN
 */
public class ATMIT {
    
    public ATMIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
      System.out.println("Function are being tested.");
    }
    
    @After
    public void tearDown() {
        System.out.println("Function are successfully tested.");
    }

    /**
     * Test of Pincheck method, of class ATM.
     */
    @org.junit.Test
    public void testPincheck() {
        
        System.out.println("checkpin");
        double result1=ATM.Pincheck("1111");
        double result2=ATM.Pincheck("2222");
        double result3=ATM.Pincheck("3333");
        double result4=ATM.Pincheck("1234");
        assertEquals("Invalid Range",0.0, result1, 0.0);
          assertEquals("Invalid Range",0.0, result2, 0.0);
            assertEquals("Invalid Range",0.0, result3, 0.0);
        
        assertEquals("VALID",1.0, result4, 0.0);
        
    }

    /**
     * Test of Transection method, of class ATM.
     */
    @org.junit.Test
    public void testTransection() {
 
         System.out.println("TestTransection");
        double result1=ATM.Transection(16000,400);
        double result2=ATM.Transection(10000,400);
        double result3=ATM.Transection(16000,15000);
       double result4=ATM.Transection(10000,15000);
        assertEquals("Invalid Range",0.0, result1, 0.0);
          assertEquals("Invalid Range",0.0, result2, 0.0);
            assertEquals("Invalid Range",0.0, result3, 0.0);
        
        assertEquals("VALID",0.0, result4, 0.0);
        
        
    }

    /**
     * Test of Transfermoney method, of class ATM.
     */
    @org.junit.Test
    public void testTransfermoney() {
       
         double result1=ATM.Transfermoney(16000,400,1000);
        double result2=ATM.Transfermoney(1000,300,1000);
        double result3=ATM.Transfermoney(20000,15000,1000);
        double result4=ATM.Transfermoney(18000,200,1234);
        double result5=ATM.Transfermoney(5000,15000,2000);
        double result6=ATM.Transfermoney(30000,15000,1234);
        double result7=ATM.Transfermoney(10000,400,1234);
        double result8=ATM.Transfermoney(10000,150000,1234);
        
        assertEquals("Invalid Range",0.0, result1, 0.0);
          assertEquals("Invalid Range",0.0, result2, 0.0);
            assertEquals("Invalid Range",0.0, result3, 0.0);
             assertEquals("Invalid Range",0.0, result4, 0.0);
          assertEquals("Invalid Range",0.0, result5, 0.0);
            assertEquals("Invalid Range",0.0, result6, 0.0);
        assertEquals("Invalid Range",0.0, result7, 0.0);
        assertEquals("VALID",0.0, result8, 0.0);
    }

    /**
     * Test of main method, of class ATM.
     */
    @org.junit.Test
    public void testMain() {
        
    }
    
    
}
