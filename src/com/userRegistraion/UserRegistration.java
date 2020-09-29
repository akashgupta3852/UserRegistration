package com.userRegistraion;

import java.util.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static List<String> emailIdList=new ArrayList<>();
	
	public static void addEmailInList() {
		emailIdList.add("abc@yahoo.com");
		emailIdList.add("abc-100@yahoo.com");
		emailIdList.add("abc.100@yahoo.com");
		emailIdList.add("abc111@abc.com");
		emailIdList.add("abc-100@abc.net");
		emailIdList.add("abc.100@abc.com.au");
		emailIdList.add("abc@1.com");
		emailIdList.add("abc+100@gmail.com");
		emailIdList.add("abc");
		emailIdList.add("abc@.com.my");
		emailIdList.add("abc123@gmail.a");
		emailIdList.add("abc123@.com");
		emailIdList.add("abc123@.com.com");
		emailIdList.add(".abc@abc.com");
		emailIdList.add("abc()*@gmail.com");
		emailIdList.add("abc@%*.com");
		emailIdList.add("abc..2002@gmail.com");
		emailIdList.add("abc.@gmail.com");
		emailIdList.add("abc@abc@gmail.com");
		emailIdList.add("abc@gmail.com.1a");
		emailIdList.add("abc@gmail.com.aa.au");
		emailIdList.add("abc@gmail.com.com");
	}
	
	public static void checkAllEmailSamples() {
		for(String id : emailIdList) {
			if(isValidEmailId(id))
				System.out.println("The email id: "+id+" is valid");
			else
				System.out.println("Sorry, the email id: "+id+" is invalid");
		}
	}
	
	public static boolean isValidFirstName(String firstName) {
		String regex="^[A-Z][a-z]{2,}";
		Pattern pattern=Pattern.compile(regex);
		if(pattern.matcher(firstName).matches())
			return true;
		return false;
	}

	public static boolean isValidLastName(String lastName) {
		String regex="^[A-Z][a-z]{2,}";
		Pattern pattern=Pattern.compile(regex);
		if(pattern.matcher(lastName).matches())
			return true;
		return false;
	}
	
	public static boolean isValidEmailId(String emailId) {
		String regex="^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";
		Pattern pattern=Pattern.compile(regex);
		if(pattern.matcher(emailId).matches())
			return true;
		return false;
	}
	
	public static boolean isValidMobileNumber(String mobileNumber) {
		String regex="^[0-9]{2}[\\s]{1}[6-9][0-9]{9}$";
		Pattern pattern=Pattern.compile(regex);
		if(pattern.matcher(mobileNumber).matches())
			return true;
		return false;
	}
	
	public static boolean isValidPassword(String password) {
		String regex=".{8,}";
		String regex1="[A-Z]";
		String regex2="[0-9]";
		String regex3="\\W";
		Pattern pattern=Pattern.compile(regex);
		Pattern pattern1=Pattern.compile(regex1);
		Pattern pattern2=Pattern.compile(regex2);
		Pattern pattern3=Pattern.compile(regex3);
		if(pattern.matcher(password).matches())
			if(pattern1.matcher(password).find())
				if(pattern2.matcher(password).find())
					if(pattern3.matcher(password).find())					
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem");

		System.out.println("Checking all email samples:");
		addEmailInList();
		checkAllEmailSamples();

		
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
