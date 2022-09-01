/*
 * Author Name: Aditya Chaurasia
 * Date: 01-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a temperature in Fahrenheit
        System.out.println("Please enter the reading of temperature in Fahrenheit: ");
        // store the temperature in Fahrenheit
        double temperatureInFahrenheit = scanner.nextDouble();

        // call the method to convert the temperature from Fahrenheit to Celsius
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // store the temperature in Celsius
        double toCelsius = temperatureConverter.convertFahrenheitToCelsius(temperatureInFahrenheit);
        // print the temperature in Celsius
        System.out.println(temperatureInFahrenheit + "°F = " + toCelsius + "°C");

        // Prompt the user to enter a temperature in Celsius
        System.out.println("Please enter the reading of temperature in Celsius: ");
        // store the temperature in Celsius
        double temperatureInCelsius = scanner.nextDouble();

        // call the method to convert the temperature from Celsius to Fahrenheit
        double toFahrenheit = temperatureConverter.convertCelsiusToFahrenheit(temperatureInCelsius);
        // print the temperature in Fahrenheit
        System.out.println(temperatureInCelsius + "°C = " + toFahrenheit + "°F");

        // close the scanner object
        scanner.close();

    }

    /**
     * This method takes temperature input in celsius and converts it in fahrenheit.
     *
     * @param temperatureInCelsius the temperature in celsius.
     * @return the converted temperature in fahrenheit.
     */
    public double convertCelsiusToFahrenheit(double temperatureInCelsius) {
        // Write Formula to calculate Fahrenheit from Celsius
        return (temperatureInCelsius * 1.8) + 32;
    }

    /**
     * This method takes temperature input in fahrenheit and converts it in celsius.
     *
     * @param temperatureInFahrenheit the temperature in fahrenheit.
     * @return the converted temperature in celsius.
     */
    public double convertFahrenheitToCelsius(double temperatureInFahrenheit) {
        // Write Formula to calculate Celsius from Fahrenheit
        return (temperatureInFahrenheit - 32) / 1.8;
    }
}

