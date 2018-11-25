package org.fusionsystems.amsprogtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fusionsystems.amsprogtest.daoimpl.PersonDAOImpl;
import com.fusionsystems.amsprogtest.model.Person;
import com.fusionsystems.amsprogtest.util.PersonUtil;
/**
 * 
 * 
 * @author Ramesh
 *
 */

public class PersonController {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		int menuChoice = 3;
		PersonDAOImpl daoImpl = new PersonDAOImpl();
		Scanner input = new Scanner(System.in);
		// addPerson
		do {
			System.out.println("\t\t\tPeople Management Record Menu\n");
			System.out
					.println("\t\t1. Add Person\t2. Calculate Average Age\t3. View Persons\t4. Exit \n");
			try {
				System.out.println("Enter a choice: ");
				menuChoice = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				continue;
			}
			// Adding the person
			if (menuChoice == 1) {
				// Get the Fill Name
				String fullName = PersonUtil.getFullName(input);
				//Get Age
				int age = PersonUtil.getAge(input, fullName);
				//Get Gender
				String gender = PersonUtil.getGender(input, fullName); // null;
				// Adding the person details into dao
				Person person = daoImpl.addPerson(fullName, age, gender);
				persons.add(person);
			} else if (menuChoice == 2) {
				// listout all the person
				System.out
						.println(" Please Enter String To Find The Average Age \n");
				String searchVal = input.nextLine();
				float avgAge = daoImpl.getAverageCalculatedAge(persons,
						searchVal);
				System.out.println("\nThe Average Age is : \n\t\t\t" + avgAge);
			} else if (menuChoice == 3) {
				//Calculate Average Age
				System.out.println("\nAll Persons Details:");
				System.out.println("___________________________________________________________________\n");
				List<Person> personList = daoImpl.getPersons(persons);
				System.out.println("\tFull Name\t\tAge\tGender");
				for (Person person : personList) {
					System.out.println("\t" + person.getPersonName() + "\t\t"
							+ person.getPersonAge() + "\t"
							+ person.getPersonGender());
				}
				System.out.println("");
			} else {
				break;
			}
		} while (menuChoice < 4);
	}
}
