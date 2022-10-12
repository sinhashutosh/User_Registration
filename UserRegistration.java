package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter First Name...");
        String fName = sc.next();
        boolean result1 = validateFirstName(fName);
        System.out.println("First Name = " + result1);
        System.out.println("*********************************");
        System.out.println("Enter Last Name...");
        String lName = sc.next();
        boolean result2 = validateLastName(lName);
        System.out.println("First Name = " + result2);
        System.out.println("*********************************");
        System.out.println("Enter your Email ID...");
        String email = sc.next();
        boolean result3 = validateemailId(email);
        System.out.println("First Name = " + result3);
        System.out.println("*********************************");
        System.out.println("Enter Your Mobile Number...");
        String mNum = sc.nextLine();
        boolean result4 = validateMobileNumber(mNum);
        System.out.println("First Name = " + result4);
        System.out.println("*********************************");
        System.out.println("Enter password...");
        String pswd = sc.next();
        boolean result5 = validatePassword(pswd);
        System.out.println("First Name = " + result5);
    }

    static boolean validateFirstName(String FirstName) {
        String regix = "^[A-Z]{1}[a-z]{2,}";
        Pattern fpattern = Pattern.compile(regix);
        Matcher fmatcher = fpattern.matcher(FirstName);
        return fmatcher.matches();
    }

    static boolean validateLastName(String lastName) {
        String regix = "^[A-Z]{1}[a-z]{2,}";
        Pattern lpattern = Pattern.compile(regix);
        Matcher lmatcher = lpattern.matcher(lastName);
        return lmatcher.matches();
    }

    static boolean validateemailId(String emailId) {
        String eRegix = "^[a-zA-Z0-9[_.+-]?]+@[a-zA-Z0-9]+\\.+[a-zA-Z0-9]+(\\.+[a-zA-Z]{2})?";
        Pattern Epattern = Pattern.compile(eRegix);
        Matcher Ematcher = Epattern.matcher(emailId);
        return Ematcher.matches();
        }

        static boolean validateMobileNumber (String mobileNumber){
            String mRegix = "^(0|\\+91|91)(\\s)?[6-9]{1}[0-9]{9}";
            Pattern mPattern = Pattern.compile(mRegix);
            Matcher mMatcher = mPattern.matcher(mobileNumber);
            return mMatcher.matches();
        }

        static boolean validatePassword (String password){
            String pRegix = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).{8,}";
            Pattern ppattern = Pattern.compile(pRegix);
            Matcher pmatcher = ppattern.matcher(password);
            return pmatcher.matches();
        }
    }
