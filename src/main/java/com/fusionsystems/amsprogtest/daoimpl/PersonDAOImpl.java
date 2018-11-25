/**
 * 
 */
package com.fusionsystems.amsprogtest.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.fusionsystems.amsprogtest.dao.PersonDAO;
import com.fusionsystems.amsprogtest.model.Person;

/**
 * @author Ramesh
 *
 */
public class PersonDAOImpl implements PersonDAO{

	public PersonDAOImpl(){
		
	}

	@Override
	public Person addPerson(String name, int age, String gender) {
		
		Person person = new Person(gender, age, gender);
		
		person.setPersonName(name);
		person.setPersonAge(age);
		person.setPersonGender(gender);

		return person;
	}

	@Override
	public List<Person> getPersons(ArrayList<Person> persons) {
		return persons;
	}

	@Override
	public float getAverageCalculatedAge(ArrayList<Person> persons,String userValue) {
		// TODO Auto-generated method stub
		int avgAge = 0;
		int count = 0;
		float average;
		for (Person person : persons) {
			if(person.getPersonName().contains(userValue)){
				avgAge = avgAge +person.getPersonAge();
				count++;
			}
		}
		average = avgAge/count;
		return average;
	}

}
