package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String regix = "^[A-Z][a-z]{2}[a-z]+";
        System.out.println("Enter First Name...");
        String fName = sc.next();
        Pattern pattern = Pattern.compile(regix);
        Matcher matcher = pattern.matcher(fName);
        if (matcher.matches()) {
            System.out.println("Your Name Accepted");
        } else {
            System.out.println("Invalid Type...");
        }
    }
}
