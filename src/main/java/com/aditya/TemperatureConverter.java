/*
 * Author Name: Aditya Chaurasia
 * Date: 01-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

public class TemperatureConverter {



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
        return (temperatureInFahrenheit - 32)/1.8;
    }
}

