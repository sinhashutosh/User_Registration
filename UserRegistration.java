package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* String regix = "^[A-Z]{1}[a-z]{2,}";
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
            return;
        }
        System.out.println("*********************************");
        String eRegix = "^[a-zA-Z0-9[_.+-]?]+@[a-zA-Z0-9]+\\.+[a-zA-Z0-9]+(\\.+[a-zA-Z]{2})?";
        Pattern Epattern = Pattern.compile(eRegix);
        System.out.println("Enter your Email ID...");
        String email = sc.next();
        Matcher Ematcher = Epattern.matcher(email);
        if (Ematcher.matches()) {
            System.out.println("Your Email Accepted...");
        } else {
            System.out.println("Your Entered Worng Email Address...");
            return;
        }
        System.out.println("*********************************");
        String mRegix = "^(0|\\+91|91)?[6-9]{1}[0-9]{9}";
      Pattern mPattern = Pattern.compile(mRegix);
      System.out.println("Enter Your Mobile Number...");
      String mNum = sc.next();
      Matcher mMatcher = mPattern.matcher(mNum);
      if (mMatcher.matches()) {
          System.out.println("Mobile Number accepted...");
      } else {
          System.out.println("Invalid Mobile Number...");
      }*/
        System.out.println("*********************************");
        String pRegix = "[a-zA-Z0-9]{8,}";
        Pattern pattern = Pattern.compile(pRegix);
        System.out.println("Enter password...");
        String pswd = sc.next();
        Matcher matcher = pattern.matcher(pswd);
        if (matcher.matches())  {
            System.out.println("Password Accepted...");
        } else {
            System.out.println("Invalid Type...");
        }
    }
}
