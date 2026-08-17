package library.block_2.task2_2;

public class Overflow {

    // Избавляемся от "магических чисел": выносим все коэффициенты времени в константы
    private static final int YEARS_COUNT = 100;
    private static final int DAYS_IN_YEAR = 365;
    private static final int HOURS_IN_DAY = 24;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args) {
        // 1. Демонстрация переполнения int
        int maxInt = Integer.MAX_VALUE;
        int overflowedInt = maxInt + 1; // Комментарий: Прибавили 1 к максимуму, и число ушло в минус

        System.out.println("Максимум int: " + maxInt);
        System.out.println("Максимум int + 1: " + overflowedInt);

        // 2. Расчет секунд в 100 годах через int
        int secondsInCenturyInt = YEARS_COUNT * DAYS_IN_YEAR * HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
        System.out.println("Результат в int: " + secondsInCenturyInt); // Комментарий: Число слишком большое для int, результат исказился

        // 3. Расчет секунд в 100 годах через long
        long secondsInCenturyLong = (long) YEARS_COUNT * DAYS_IN_YEAR * HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
        System.out.println("Результат в long: " + secondsInCenturyLong); // Комментарий: Тип long вмещает большие числа, ответ правильный
    }
}