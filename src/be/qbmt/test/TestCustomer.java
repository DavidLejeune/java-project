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
    
    
    public void testGetCustomerName1() {
        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        customer1.setLastName("Doe");
        assertEquals("John Doe" , customer1.getCustomerName());
    }

    public void testGetCustomerName2() {
        Customer customer2 = new Customer();
        customer2.setFirstName("Elvis");
        customer2.setLastName("Presley");
        assertEquals("Elvis Presley" , customer2.getCustomerName());
    }

    public void testGetCustomerName3() {
        Customer customer3 = new Customer();
        customer3.setFirstName("Abu Bakr");
        customer3.setLastName("Al Bagdadi");
        assertEquals("Abu Bakr Al Bagdadi" , customer3.getCustomerName());
    }
    
}
