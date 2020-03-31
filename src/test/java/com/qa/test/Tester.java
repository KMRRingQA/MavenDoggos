package com.qa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.qa.main.DoggoCompetition;

public class Tester {

	@Test
	public void doesntReturnPlace() {

		for (int i = 0; i < 99; i++) {
			assertNotEquals("1st", DoggoCompetition.placement(1).get(i));
		}
	}

	@Test
	public void listLength99() {
		assertEquals(99, DoggoCompetition.placement(1).size());
	}
}
