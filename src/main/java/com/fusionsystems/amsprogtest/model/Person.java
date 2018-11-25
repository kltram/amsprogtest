package com.fusionsystems.amsprogtest.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Person details
 * 
 * @author Ramesh
 * 
 */

public class Person {
	/**
	 * Person Name
	 */
	private String personName;
	/**
	 * Person age
	 */
	private int personAge;
	/**
	 * Person gender type
	 */
	private String personGender;


	public Person() {
	}

	/** Constructs a Person object with the given values */
	public Person(String personName, int personAge, String personGender) {
		this.personName = personName;
		this.personAge = personAge;
		this.personGender = personGender;
	}

	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * @param personName
	 *            the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	/**
	 * @return the personAge
	 */
	public int getPersonAge() {
		return personAge;
	}

	/**
	 * @param personAge
	 *            the personAge to set
	 */
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	/**
	 * @return the personGender
	 */
	public String getPersonGender() {
		return personGender;
	}

	/**
	 * @param personGender
	 *            the personGender to set
	 */
	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}


}
