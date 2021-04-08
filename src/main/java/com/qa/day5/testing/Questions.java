package com.qa.day5.testing;

public class Questions {

	public float convertFahrenheitToCelsius(int fahrenheit) {
		float out = ((float) 5 / 9) * (fahrenheit - 32);
		System.out.println(out);
		return out;
	}

	public float convertCelsiusToFahrenheit(int celsius) {
		float out = (9 / 5) * (celsius) + 32;
		System.out.println(out);
		return out;
	}

	public float convertKelvinToCelsius(int kelvin) {
		float out = (kelvin - 273);
		System.out.println(out);
		return out;
	}

	public boolean convertCelsiusToKelvin(int celsius) {
		float out = (celsius + 273);
		boolean a = false;
		System.out.println(out);
		if (out == 323.0) {
			a = true;
		} else {
		}
		return a;
	}

	public float convertKelvinToFahrenheit(int kelvin) {
		float out = (9 / 5) * (kelvin - 273) + 32;
		System.out.println(out);
		return out;
	}

	public float convertFahrenheitToKelvin(int fahrenheit) {
		float out = (5 / 9) * (fahrenheit - 32) + 273;
		System.out.println(out);
		return out;
	}

}
