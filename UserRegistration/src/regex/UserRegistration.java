package regex;

import java.util.regex.*;

public class UserRegistration {
	    public static boolean validateFirstName(String firstName) {
	        String regex = "[A-Z][a-zA-Z]{2,}";
	        return Pattern.matches(regex, firstName);
	    }

	    public static boolean validateLastName(String lastName) {
	        String regex = "[A-Z][a-zA-Z]{2,}";
	        return Pattern.matches(regex, lastName);
	    }

	    public static boolean validateEmail(String email) {
	        String regex = "[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?";
	        return Pattern.matches(regex, email);
	    }

	    public static boolean validateMobile(String mobile) {
	        String regex = "[0-9]{2} [0-9]{10}";
	        return Pattern.matches(regex, mobile);
	    }

	    public static boolean validatePassword(String password) {
	        // Minimum 8 characters, at least 1 uppercase, 1 numeric, 1 special character
	        String regex = "(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}";
	        return Pattern.matches(regex, password);
	    }

	    public static void main(String[] args) {
	        // Test the validations
	        System.out.println("First Name: " + validateFirstName("Savita")); // true
	        System.out.println("Last Name: " + validateLastName("Tekale")); // true
	        System.out.println("Email: " + validateEmail("Savitatekale@example.com")); // true
	        System.out.println("Mobile: " + validateMobile("91 9919819801")); // true
	        System.out.println("Password: " + validatePassword("savita@123")); // true
	    }
	}

