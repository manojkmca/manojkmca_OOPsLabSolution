package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Manoj", "Kumar");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		
		String s1="1.Technical";
		String s2="2.Admin";
		String s3="3.Human Resource";
		String s4="4.Legal";
		
		System.out.println("Please enter the departmetfrom the following \n" + s1 +"\n"+
		s2+ "\n" + s3+"\n" + s4);
				
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		if (option==1) {
			generatedEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(), 
					emp.getLastName().toLowerCase(), "Tech");
					generatedPassword=cs.generatePassword();
					cs.showCredentials(emp, generatedEmail, generatedPassword);
		}
		//===
		else if (option==2) {
			generatedEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(), 
					emp.getLastName().toLowerCase(), "Admin");
					generatedPassword=cs.generatePassword();
					cs.showCredentials(emp, generatedEmail, generatedPassword);
		}
		//===
		else if (option==3) {
			generatedEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(), 
					emp.getLastName().toLowerCase(), "HR");
					generatedPassword=cs.generatePassword();
					cs.showCredentials(emp, generatedEmail, generatedPassword);
		}
		//===
		else if (option==4) {
			generatedEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(), 
					emp.getLastName().toLowerCase(), "Legal");
					generatedPassword=cs.generatePassword();
					cs.showCredentials(emp, generatedEmail, generatedPassword);
		}
		else 
			System.out.println("Please enter a valid option betwee 1 to 4 only!");
		sc.close();
	}

}
