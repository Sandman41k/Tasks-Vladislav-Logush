package Library.task1_4;
//Задача 2 — Перепишите правильно

public class TemperatureConverter {
    public static final double ABSOLUTE_ZERO_CELSIUS = -273.15;
    public static final double BOILING_POINT_CELSIUS = 100.0;

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static boolean isAboveBoiling(double celsius) {
        return celsius > BOILING_POINT_CELSIUS;
    }
}


