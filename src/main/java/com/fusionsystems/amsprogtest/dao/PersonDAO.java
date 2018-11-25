/**
 * 
 */
package com.fusionsystems.amsprogtest.dao;

import java.util.ArrayList;
import java.util.List;

import com.fusionsystems.amsprogtest.model.Person;

/**
 * @author Ramesh
 *
 */
public interface PersonDAO {
	Person  addPerson(String name, int age, String gender);
	List<Person>  getPersons(ArrayList<Person> persons);
	float  getAverageCalculatedAge(ArrayList<Person> persons,String userValue);
}
