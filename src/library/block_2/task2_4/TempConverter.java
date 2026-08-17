package library.block_2.task2_4; // Пакет оставляем как у вас на скриншоте

public class TempConverter {

    // Константы, чтобы не было "магических чисел"
    private static final double FAHRENHEIT_BASE = 32.0;
    private static final double KELVIN_BASE = 273.15;
    private static final double FAHRENHEIT_MULTI = 9.0;
    private static final double FAHRENHEIT_DIV = 5.0;

    public static void main(String[] args) {
        System.out.println("=== Конвертер температур ===");

        // Переменная для текущего значения Цельсия
        double celsius;
        double fahrenheit;
        double kelvin;

        // 1. Проверка для 100 градусов
        celsius = 100.0;
        fahrenheit = celsius * (FAHRENHEIT_MULTI / FAHRENHEIT_DIV) + FAHRENHEIT_BASE;
        kelvin = celsius + KELVIN_BASE;
        System.out.println("Цельсий: " + celsius + " | Фаренгейт: " + fahrenheit + " | Кельвин: " + kelvin);

        // 2. Проверка для 0 градусов
        celsius = 0.0;
        fahrenheit = celsius * (FAHRENHEIT_MULTI / FAHRENHEIT_DIV) + FAHRENHEIT_BASE;
        kelvin = celsius + KELVIN_BASE;
        System.out.println("Цельсий: " + celsius + " | Фаренгейт: " + fahrenheit + " | Кельвин: " + kelvin);

        // 3. Проверка для 37 градусов
        celsius = 37.0;
        fahrenheit = celsius * (FAHRENHEIT_MULTI / FAHRENHEIT_DIV) + FAHRENHEIT_BASE;
        kelvin = celsius + KELVIN_BASE;
        System.out.println("Цельсий: " + celsius + " | Фаренгейт: " + fahrenheit + " | Кельвин: " + kelvin);

        // 4. Проверка для -40 градусов
        celsius = -40.0;
        fahrenheit = celsius * (FAHRENHEIT_MULTI / FAHRENHEIT_DIV) + FAHRENHEIT_BASE;
        kelvin = celsius + KELVIN_BASE;
        System.out.println("Цельсий: " + celsius + " | Фаренгейт: " + fahrenheit + " | Кельвин: " + kelvin);
        // Интересный факт: -40 градусов — это точка, где шкалы Цельсия и Фаренгейта совпадают
        System.out.println("Интересный факт: При -40 градусах Цельсий равен Фаренгейту!");
    }
}
