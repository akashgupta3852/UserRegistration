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

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem");
		
		System.out.println("Enter the first name:");
		Scanner scan=new Scanner(System.in);
		String fName=scan.nextLine();
		
		System.out.println("The first name: "+fName+" is "+isValidFirstName(fName));
	}

}
