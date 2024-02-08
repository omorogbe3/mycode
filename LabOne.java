package com.prog2.labs;

/**
 * @author adinashby
 *
 */
public class LabOne {

	/**
	 * Write your test code below in the main.
	 *
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Please refer to the README file for question(s) description
	 */
	
	public String concatStringToEnd(String firstString, String secondString) {
		return firstString + " " + secondString;
	}
	
	public boolean doesEndWithSecondString(String firstString, String secondString) {
		return firstString.endsWith(secondString);
	}
	
	public int randomIntegerGenerator(int startingNumber, int endingNumber) {
            
		return random.nextInt(endingNumber - startingNumber + 1) + startingNumber;
	}
	
	public boolean isPasswordValid(String password) {
		return false;
	}

}
