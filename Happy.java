package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Happy {
    UserRegistration ur = new UserRegistration();
    boolean expected = true;

    @Test
    public void methodShouldReturnTrueforFirstName() {

        Assertions.assertEquals(expected, ur.validateFirstName("Ashutosh"));
    }
//    org.junit.jupiter:junit-jupiter-params:5.8.2

    @Test
    public void methodShouldReturnTrueforLastName() {
        Assertions.assertEquals(expected, ur.validateLastName("Singh"));
    }
    @ParameterizedTest
    @ValueSource (strings = {"abc@yahoo.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1", "abc-100@yahoo.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com","abc –", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
            "abc@.com.my"})
    public void methodShouldReturnTrueforEmailId(String inputEmail) {
        Assertions.assertEquals(expected, ur.validateemailId(inputEmail));
    }

    @Test
    public void methodShouldReturnTrueforMobileNumber() {
        Assertions.assertEquals(expected, ur.validateMobileNumber("+91 9119646209"));
    }

    @Test
    public void methodShouldReturnTrueforPassword() {
        Assertions.assertEquals(expected, ur.validatePassword("Asdaas@1"));
    }
}
