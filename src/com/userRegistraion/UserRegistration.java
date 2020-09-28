package com.userRegistraion;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static String isValidFirstName(String firstName) {
		String regex="^[A-Z][a-z]{2,}";
		Pattern pattern=Pattern.compile(regex);
		if(pattern.matcher(firstName).matches())
			return "valid";
		return "invalid";
	}

	public static String isValidLastName(String lastName) {
		String regex="^[A-Z][a-z]{2,}";
		Pattern pattern=Pattern.compile(regex);
		if(pattern.matcher(lastName).matches())
			return "valid";
		return "invalid";
	}

	public static String isValidEmailId(String emailId) {
		String regex="^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";
		Pattern pattern=Pattern.compile(regex);
		if(pattern.matcher(emailId).matches())
			return "valid";
		return "invalid";
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem");
		
		System.out.println("Enter the first name:");
		Scanner scan=new Scanner(System.in);
		String fName=scan.nextLine();
		System.out.println("The first name: "+fName+" is "+isValidFirstName(fName));
		
		System.out.println("Enter the last name:");
		String lName=scan.nextLine();
		System.out.println("The last name: "+lName+" is "+isValidLastName(lName));
		
		System.out.println("Enter the email id:");
		String email=scan.nextLine();		
		System.out.println("The email id: "+email+" is "+isValidEmailId(email));
	}

}
