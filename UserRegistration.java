package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String regix = "^[A-Z]{1}[a-z]{2,}";
        System.out.println("Enter First Name...");
        String fName = sc.next();
        Pattern fpattern = Pattern.compile(regix);
        Matcher fmatcher = fpattern.matcher(fName);
        if (fmatcher.matches()) {
            System.out.println("Your First Name Accepted");
        } else {
            System.out.println("Invalid First Name Format...");
            return;
        }
        System.out.println("*********************************");
        System.out.println("Enter Last Name...");
        String lName = sc.next();
        Pattern lpattern = Pattern.compile(regix);
        Matcher lmatcher = lpattern.matcher(lName);
        if (lmatcher.matches()) {
            System.out.println("Your Last Name Accepted");
        } else {
            System.out.println("Invalid Last Name Format...");
        }
    }
}
