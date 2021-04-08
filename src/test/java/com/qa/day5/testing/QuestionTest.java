package com.qa.day5.testing;

import static org.junit.Assert.*;
import org.junit.*;

public class QuestionTest {
	@BeforeClass
	public static void setup() {
		System.out.println("Connecting to test db");
	}

	@Before
	public void init() {
		System.out.println("Testing...");
	}

	private Questions questions = new Questions();

	@Test
	public void FahrenheitToCelsius() {
		assertEquals(10.0, questions.convertFahrenheitToCelsius(50), 1);
	}

	@Test
	public void CelsiusToFahrenheit() {
		assertEquals(82.0, questions.convertCelsiusToFahrenheit(50), 1);
	}

	@Test
	public void KelvinToCelsius() {
		assertEquals(-223.0, questions.convertKelvinToCelsius(50), 1);
	}

	@Test
	public void CelsiusToKelvin() {
		assertTrue(questions.convertCelsiusToKelvin(50));
	}

	@Test
	public void KelvinToFahrenheit() {
		assertEquals(-191.0, questions.convertKelvinToFahrenheit(50), 1);
	}

	@Test
	public void FahrenheitToKelvin() {
		assertEquals(273.0, questions.convertFahrenheitToKelvin(50), 1);
	}
	
	@After
	public void finalise() {
	    System.out.println("Ending Test");
	}

	@AfterClass
	public static void teardown() {
	    System.out.println("Disconnecting from db");
	}

}
