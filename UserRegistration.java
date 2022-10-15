package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration extends Exception {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws UserRegistrationException {
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

    static boolean validateFirstName(String FirstName) throws UserRegistrationException {
        try {
            String regix = "^[A-Z]{1}[a-z]{2,}";
            Pattern fpattern = Pattern.compile(regix);
            Matcher fmatcher = fpattern.matcher(FirstName);
            if (fmatcher.matches()) {
                return true;
            } else {
                throw new UserRegistrationException();
            }
        } catch (UserRegistrationException e) {
            System.out.println("You Entered Inavlid First Name ");
            return false;
        }
    }

    static boolean validateLastName(String lastName) throws UserRegistrationException {
        String regix = "^[A-Z]{1}[a-z]{2,}";
        try {
            Pattern lpattern = Pattern.compile(regix);
            Matcher lmatcher = lpattern.matcher(lastName);
            if (lmatcher.matches()) {
                return true;
            } else {
                throw new UserRegistrationException();
            }
        } catch (UserRegistrationException e) {
            System.out.println("You Entered Inavlid First Name ");
            return false;
        }
    }

    static boolean validateemailId(String emailId) throws UserRegistrationException {
        String eRegix = "^[a-zA-Z0-9[_.+-]?]+@[a-zA-Z0-9]+\\.+[a-zA-Z0-9]+(\\.+[a-zA-Z]{2})?";
        try {
            Pattern Epattern = Pattern.compile(eRegix);
            Matcher Ematcher = Epattern.matcher(emailId);
            if (Ematcher.matches()) {
                return true;
            } else {
                throw new UserRegistrationException();
            }
        } catch (UserRegistrationException e) {
            System.out.println("You Entered Inavlid Last Name ");
            return false;
        }
    }
        static boolean validateMobileNumber (String mobileNumber) throws UserRegistrationException {
            String mRegix = "^(0|\\+91|91)(\\s)?[6-9]{1}[0-9]{9}";
            try {
            Pattern mPattern = Pattern.compile(mRegix);
            Matcher mMatcher = mPattern.matcher(mobileNumber);
                if (mMatcher.matches()) {
                    return true;
                } else {
                    throw new UserRegistrationException();
                }
            } catch (UserRegistrationException e) {
                System.out.println("You Entered Inavlid Mobile Number ");
                return false;
            }
        }

        static boolean validatePassword (String password) throws UserRegistrationException {
            String pRegix = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).{8,}";
           try {
            Pattern ppattern = Pattern.compile(pRegix);
            Matcher pmatcher = ppattern.matcher(password);
               if (pmatcher.matches()) {
                   return true;
               } else {
                   throw new UserRegistrationException();
               }
           } catch (UserRegistrationException e) {
               System.out.println("You Entered Inavlid  Password ");
               return false;
           }
        }
    }
