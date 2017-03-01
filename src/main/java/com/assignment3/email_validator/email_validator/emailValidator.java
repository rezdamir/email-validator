package com.assignment3.email_validator.email_validator;
import java.util.regex.*;

public class emailValidator {
	/**
	 * This method returns true if the input string has a single '@' character.
	 * @param email string to test
	 * @return 1 if the string has a single '@' character and 0 otherwise
	 */
	public int validateAtSign(String email) {
		if ( Pattern.matches("^[^@]*@[^@]*", email) )
			return 1;
		else return 0;
	}
	/**
	 * This method returns true if the string input string has at least one '.' character.
	 * @param email string to test
	 * @return 1 if the string has at least one '.' character and 0 otherwise
	 */
	public int validateDotSign(String email) {
		
		if ( Pattern.matches(".*\\.*.*", email) )
			return 1;
		else return 0;
	}
	/**
	 * This method returns true if the string input string has at least one '.' character.
	 * @param email string to test
	 * @return the number of tests passed
	 */
	public int validateStage1(String email) {
		int count = 0;
		count += validateAtSign(email);
		count += validateDotSign(email);
		return count;
	}

}