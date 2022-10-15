package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Happy {
    UserRegistration ur = new UserRegistration();
    boolean expected = true;

    @Test
    public void methodShouldReturnTrueforFirstName() throws UserRegistrationException {

        Assertions.assertEquals(expected, ur.validateFirstName("ashutosh"));
    }
//    org.junit.jupiter:junit-jupiter-params:5.8.2

    @Test
    public void methodShouldReturnTrueforLastName() throws UserRegistrationException {
        Assertions.assertEquals(expected, ur.validateLastName("singh"));
    }
@Test
    public void methodShouldReturnTrueforEmailId() throws UserRegistrationException {
        Assertions.assertEquals(expected, ur.validateemailId("ashu@@.cse.sln@gmail.com"));
    }

    @Test
    public void methodShouldReturnTrueforMobileNumber() throws UserRegistrationException {
        Assertions.assertEquals(expected, ur.validateMobileNumber("119646209"));
    }

    @Test
    public void methodShouldReturnTrueforPassword() throws UserRegistrationException {
        Assertions.assertEquals(expected, ur.validatePassword("asdaas@1"));
    }
}
