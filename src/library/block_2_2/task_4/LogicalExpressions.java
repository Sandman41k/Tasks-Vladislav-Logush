package library.block_2_2.task_4;

public class LogicalExpressions {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 10;

        // Предсказание: true (10 равно 10)
        boolean r1 = x == z;

        // Предсказание: true (10 не равно 20)
        boolean r2 = x != y;

        // Предсказание: true (оба условия верны: 10 < 20 И 20 > 10)
        boolean r3 = x < y && y > z;

        // Предсказание: true (хотя 10 > 20 ложно, второе условие 10 == 10 истинно. Для оператора ИЛИ || достаточно одного true)
        boolean r4 = x > y || x == z;

        // Предсказание: true (НЕ(10 == 20) превращается в НЕ(false) -> true. Второе условие 20 >= 20 тоже true. Итог: true И true)
        boolean r5 = !(x == y) && (y >= 20);

        // Предсказание: true
        // ОБЪЯСНЕНИЕ ДЛЯ r6: Деление на ноль (1 / 0) не вызывает ошибку ArithmeticException из-за
        // механизма сокращенного вычисления (короткого замыкания / short-circuit evaluation) оператора ИЛИ (||).
        // Так как первая часть выражения (x == 10) возвращает true, Java уже знает, что всё выражение ИЛИ
        // будет истинным, независимо от второй части. Поэтому виртуальная машина (JVM) просто игнорирует
        // и вообще НЕ вычисляет вторую часть (1 / 0 > 0), тем самым избегая падения программы.
        boolean r6 = x == 10 || 1 / 0 > 0;

        // Вывод результатов для проверки
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);
    }
}

