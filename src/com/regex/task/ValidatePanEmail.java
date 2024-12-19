package com.regex.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePanEmail {

	public static void main(String[] args) {
		String pan = "ABCDE1234F";
        String email = "example@domain.com";
        
        String panRegex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
        String emailRegex = "^[a-zA-Z0-9.]+@[a-zA-Z0-9.]+.[a-zA-Z]{2,7}$";

        Pattern panPattern = Pattern.compile(panRegex);
        Pattern emailPattern = Pattern.compile(emailRegex);

        Matcher panMatcher = panPattern.matcher(pan);
        System.out.println("PAN Valid: " + panMatcher.matches());
        
        Matcher emailMatcher = emailPattern.matcher(email);
        System.out.println("Email Valid: " + emailMatcher.matches());
	}

}
