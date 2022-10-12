package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1", "abc-100@yahoo.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com","abc –", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
            "abc@.com.my"})
    public void methodShouldReturnTrueforEmailId(String inputEmail) {
        boolean expected = false;
        Assertions.assertEquals(expected, ur.validateemailId(inputEmail));
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
