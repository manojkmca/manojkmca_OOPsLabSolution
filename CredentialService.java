package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	public char[] generatePassword() {

		String capitalLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters =  "abcdefghijklmnopqrstuvwxyz"	;
		String numbers= "0123456789";
		String specialCharacters="!@#$%^&*()_+=-/.~";
		String values = capitalLetters+smallLetters+numbers+specialCharacters; //79

		Random random =new Random();
		char[] password = new char[8];
		for (int i=0; i<8; i++)
		{
			password[i]=values.charAt(random.nextInt(values.length()));
			System.out.print(password[i]);
		
		}
		return password ;
	}
	

	/*Write logic for generateEmailAddress and showCredentials.
	Step 1:
	create public String generateEmailAddress() which takes firstName,lastName & Department as arguments
	and returns mail in firstnamelastname@dept.abc.com

	Step 2:
	Create a public method which accepts employee, eMailID and Password and displays the same
	"Dear "+firstName+ " your generated credentials are as follows ");
			"Email --> "+ email);
			"Password --> 1"
			generatedPassword*/

	public String generateEmailAddress(String firstName, String lastName, String department ) {
		return firstName+lastName+"@"+department+".abc.com";
		//this.generateEmailAddress(email, pswd,dept);

	}
	public void showCredentials(Employee emp, String email, char[] generatedPassword){
		System.out.println();
		System.out.println("Dear "+ emp.getFirstName() + " your generated credentials are as follows \n"+
				"Email --> "+ email + " and "+
				"Password --> ");
		System.out.println(generatedPassword);
	}

}



