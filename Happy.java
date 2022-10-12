package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Happy {
    UserRegistration ur = new UserRegistration();
    boolean expected = true;
    @Test
    public void methodShouldReturnTrueforFirstName() {

        Assertions.assertEquals(expected, ur.validateFirstName("Ashutosh"));
    }
    @Test
    public void methodShouldReturnTrueforLastName() {
        Assertions.assertEquals(expected, ur.validateLastName("Singh"));
    }
    @Test
    public void methodShouldReturnTrueforEmailId(){
        Assertions.assertEquals(expected, ur.validateemailId("ashu.cse.sln@gmail.com"));
    }
    @Test
    public void methodShouldReturnTrueforMobileNumber(){
        Assertions.assertEquals(expected, ur.validateMobileNumber("+91 9119646209"));
    }
    @Test
    public void methodShouldReturnTrueforPassword(){
        Assertions.assertEquals(expected, ur.validatePassword("Asdaas@1"));
    }
}
