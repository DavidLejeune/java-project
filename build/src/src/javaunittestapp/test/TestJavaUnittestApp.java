/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaunittestapp.test;
import javaunittestapp.code.JavaUnittestApp;
import junit.framework.TestCase;


/**
 *
 * @author David
 */
public class TestJavaUnittestApp extends TestCase{
    
    
    public void testGetCustomerName() {
        JavaUnittestApp customer1 = new JavaUnittestApp();
        customer1.setFirstName("John");
        customer1.setLastName("Doe");
        assertEquals("John Doe" , customer1.getCustomerName());
    }
    
    
    
}
