package library.block_2_2.task_1;

public class Calculator {
    public static void main(String[] args) {
        // Объявление переменных
        int a = 17;
        int b = 5;

        // Вывод заголовка
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("---------------------------------");

        // Вычисления и вывод с пояснениями
        System.out.println("Сложение: " + a + " + " + b + " = " + (a + b));
        System.out.println("Вычитание: " + a + " - " + b + " = " + (a - b));
        System.out.println("Умножение: " + a + " * " + b + " = " + (a * b));

        // В Java деление двух int автоматически является целым делением
        System.out.println("Целое деление: " + a + " / " + b + " = " + (a / b));
        System.out.println("Остаток: " + a + " % " + b + " = " + (a % b));

        // Для вещественного деления приводим одну из переменных к типу double
        System.out.println("Вещественное: " + a + " / " + b + " = " + ((double) a / b));

        System.out.println("---------------------------------");
    }
}

