package library.block_2.task2_3;

import java.math.BigDecimal;

public class Finance {
    public static void main(String[] args) {
        // Расчеты через double
        double doubleSum = 0.1 + 0.2;
        double doubleSub = 10.0 - 9.0 - 0.9;

        System.out.println("Сумма в double: " + doubleSum);
        System.out.println("Вычитание в double: " + doubleSub);

        // Расчеты через BigDecimal
        BigDecimal num01 = new BigDecimal("0.1");
        BigDecimal num02 = new BigDecimal("0.2");
        BigDecimal num10 = new BigDecimal("10.0");
        BigDecimal num09 = new BigDecimal("0.9");

        BigDecimal bdSum = num01.add(num02);
        BigDecimal bdSub = num10.subtract(num09).subtract(num09);

        System.out.println("Сумма в BigDecimal: " + bdSum);
        System.out.println("Вычитание в BigDecimal: " + bdSub);
    }

}

