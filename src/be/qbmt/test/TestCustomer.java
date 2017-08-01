/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.qbmt.test;
import be.qbmt.code.Customer;
import junit.framework.TestCase;

/**
 *
 * @author David
 */
public class TestCustomer extends TestCase{
    
    
    public void testGetCustomerName() {
        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        customer1.setLastName("Doe");
        assertEquals("John Doe" , customer1.getCustomerName());
    }
    
    
    
}
