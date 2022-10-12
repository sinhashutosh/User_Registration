package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sad {
    UserRegistration ur = new UserRegistration();
    boolean expected = true;
    @Test
    public void methodShouldReturnFalseforFirstName() {

        Assertions.assertEquals(expected, ur.validateFirstName("a1shutosh"));
    }
    @Test
    public void methodShouldReturnFalseforLastName() {
        Assertions.assertEquals(expected, ur.validateLastName("s23ingh"));
    }
    @Test
    public void methodShouldReturnFalseforEmailId(){
        Assertions.assertEquals(expected, ur.validateemailId("ashu.cse.sln@gmail.com.com.com"));
    }
    @Test
    public void methodShouldReturnFalseforMobileNumber(){
        Assertions.assertEquals(expected, ur.validateMobileNumber("+91 913419646209"));
    }
    @Test
    public void methodShouldReturnFalseforPassword(){
        Assertions.assertEquals(expected, ur.validatePassword("sdsdsdaas@1"));
    }
}
