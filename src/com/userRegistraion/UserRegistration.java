package com.userRegistraion;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
	private static final String EMAIL_ADDRESS_PATTERN="^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	private static final String MOBILE_NUMBER_PATTERN="^[0-9]{2}[\\s]{1}[6-9][0-9]{9}$";
	private static final String PASSWORD_PATTERN="(?=.*[A-Z]).{8,}";
	
	public static boolean isValidFirstName(String firstName) {
		Pattern pattern=Pattern.compile(NAME_PATTERN);
		if(pattern.matcher(firstName).matches())
			return true;
		return false;
	}

	public static boolean isValidLastName(String lastName) {
		Pattern pattern=Pattern.compile(NAME_PATTERN);
		if(pattern.matcher(lastName).matches())
			return true;
		return false;
	}
	
	public static boolean isValidEmailId(String emailId) {
		Pattern pattern=Pattern.compile(EMAIL_ADDRESS_PATTERN);
		if(pattern.matcher(emailId).matches())
			return true;
		return false;
	}
	
	public static boolean isValidMobileNumber(String mobileNumber) {
		Pattern pattern=Pattern.compile(MOBILE_NUMBER_PATTERN);
		if(pattern.matcher(mobileNumber).matches())
			return true;
		return false;
	}
	
	public static boolean isValidPassword(String password) {
		Pattern pattern=Pattern.compile(PASSWORD_PATTERN);
		if(pattern.matcher(password).matches())
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem");

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the first name:");
		String fName=scan.nextLine();
		if(isValidFirstName(fName))
		System.out.println("The first name: "+fName+" is valid");
		else
		{
			System.out.println("Sorry, the first name: "+fName+" is invalid");
			System.exit(0);;
		}
		
		System.out.println("Enter the last name:");
		String lName=scan.nextLine();
		if(isValidLastName(lName))
			System.out.println("The last name: "+lName+" is valid");
			else
			{
				System.out.println("Sorry, the last name: "+lName+" is invalid");
				System.exit(0);;
			}
		
		System.out.println("Enter the email id:");
		String email=scan.nextLine();
		if(isValidEmailId(email))
			System.out.println("The email id: "+email+" is valid");
			else
			{
				System.out.println("Sorry, the email id: "+email+" is invalid");
				System.exit(0);;
			}
		
		
		System.out.println("Enter the mobile number:");
		String mobile=scan.nextLine();	
		if(isValidMobileNumber(mobile))
			System.out.println("The mobile number: "+mobile+" is valid");
			else
			{
				System.out.println("Sorry, the mobile number: "+mobile+" is invalid");
				System.exit(0);;
			}
		
		System.out.println("Enter the password:");
		String passcode=scan.nextLine();	
		if(isValidPassword(passcode))
			System.out.println("The password: "+passcode+" is valid");
			else
			{
				System.out.println("Sorry, the password: "+passcode+" is invalid");
				System.exit(0);;
			}
	}

}
