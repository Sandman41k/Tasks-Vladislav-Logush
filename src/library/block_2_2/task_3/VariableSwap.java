package library.block_2_2.task_3;

public class VariableSwap {
    public static void main(String[] args) {

        System.out.println("ВАРИАНТ А (через третью переменную)");
        int a = 10;
        int b = 20;
        System.out.println("До обмена: a = " + a + ", b = " + b);

        // Логика обмена через temp
        int temp = a; // Сохраняем значение 'a' (10) в буфер
        a = b;        // Записываем в 'a' значение 'b' (20)
        b = temp;     // Записываем в 'b' сохраненное значение из буфера (10)

        System.out.println("После обмена: a = " + a + ", b = " + b);
        System.out.println();


        System.out.println("ВАРИАНТ B (без третьей переменной через арифметику)");
        int x = 10;
        int y = 20;
        System.out.println("До обмена: x = " + x + ", y = " + y);

        // Логика обмена через математику
        x = x + y; // x становится равен 30 (10 + 20)
        y = x - y; // y становится равен 10 (30 - 20) — теперь в y старое значение x
        x = x - y; // x становится равен 20 (30 - 10) — теперь в x старое значение y

        System.out.println("После обмена: x = " + x + ", y = " + y);
    }
}

