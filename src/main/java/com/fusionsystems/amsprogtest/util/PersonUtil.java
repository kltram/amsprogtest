/**
 * 
 */
package com.fusionsystems.amsprogtest.util;

import java.util.Scanner;

/**
 * @author Ramesh
 *
 */
public class PersonUtil {
	
	
	public static String getGender(Scanner input, String fullName) {
		int check = -1;
		String gender = null;
		do {
			try {
				System.out.println("Please Enter Person Gender (MAN/WOMAN):\n");
				gender = input.nextLine();
				if ((gender.equalsIgnoreCase("MAN") || 
					(gender.equalsIgnoreCase("WOMAN")))) {
					
					
					if(gender.equalsIgnoreCase("WOMAN")){
						String[] names = fullName.split(" ");
						if(!names[0].endsWith("ko")){
							System.out.println("You'r not a women  : So please enter your Gender as a Man");
							gender = input.nextLine();
							
							continue;
						}
					}
					check = 1;
				}
				
			} catch (Exception e) {
				System.out.println("Person Enter Person Gender (MAN/WOMAN):\n");
				continue;
			}
			System.out.println(check);
		} while (check < 0);
		return gender;
	}

	public static int getAge(Scanner input, String fullName) {
		int age = -1;
		do {
			try {
				System.out.println("Please Enter Age:\n");
				age = Integer.parseInt(input.nextLine());
				
				if(age > 50){
					String[] names = fullName.split(" ");
					if(names[0] != "John"){
						System.out.println("Person FirstName is 'John', So Please Enter your Age < 35 :!\n");
						age = Integer.parseInt(input.nextLine());
						continue;
					}
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Please Enter Age:!\n");
				continue;
			}
		} while ((age <= 0) );
		
		return age;
	}

	public static String getFullName(Scanner input) {
		String fullName = null;
		int nameLen = -1;
		do {
			try {
				System.out
						.println("Please Enter Full Name: (examples: John Seaman)\n");
				fullName = input.nextLine();
				String[] names = fullName.split(" ");
				if(names.length == 2){
					nameLen = 0;
				}
			} catch (Exception e) {
				System.out
						.println("Please Enter Full Name! : (examples: John Seaman)\n");
				continue;
			}
		} while ((fullName != null && fullName != "") && nameLen < 0);
		return fullName;

	}



}
