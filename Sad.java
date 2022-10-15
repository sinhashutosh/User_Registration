package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sad {
    UserRegistration ur = new UserRegistration();
    boolean expected = false;
    @Test
    public void methodShouldReturnFalseforFirstName() throws UserRegistrationException {

        Assertions.assertEquals(expected, ur.validateFirstName("a1shutosh"));
    }
    @Test
    public void methodShouldReturnFalseforLastName() throws UserRegistrationException {
        Assertions.assertEquals(expected, ur.validateLastName("s23ingh"));
    }
@Test
    public void methodShouldReturnTrueforEmailId() throws UserRegistrationException {
        Assertions.assertEquals(expected, ur.validateemailId("ashu@@gmail"));
    }
    @Test
    public void methodShouldReturnFalseforMobileNumber() throws UserRegistrationException {
        Assertions.assertEquals(expected, ur.validateMobileNumber("+91 913419646209"));
    }
    @Test
    public void methodShouldReturnFalseforPassword() throws UserRegistrationException {
        Assertions.assertEquals(expected, ur.validatePassword("sdsdsdaas@1"));
    }
}
