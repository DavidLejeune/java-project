/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.qbmt.code;

/**
 *
 * @author David
 */
public class Customer {

    String firstName = null;
    String lastName = null;
    
      
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println("Hello JavaUnittestApp");
    }
    
    public String getCustomerName() {
        String returnValue = null;
        if((this.firstName != null) && (this.lastName !=null))
            returnValue = this.firstName + " " + this.lastName;
        else if (this.firstName != null) returnValue = this.firstName + " N/A";
        else if (this.lastName != null) returnValue = "N/A " + this.lastName;
        else returnValue = "N/A N/A";
        return returnValue;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
}
