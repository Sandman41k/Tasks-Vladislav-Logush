package library.task1_4;

//Задача 1 — Найди ошибки
public class StudentCalculator { // убрать нижнее подчеркивание и сделать с заглавной буквы, вот так -'StudentCalculator'
    public static final double pi = 3.14; // имя 'pi' константы сделать с заглавных букв

    public static double CalculateCircleArea(double R) { // с маленькой буквы 'calcu...' и 'R' неправильное наименование
        double S = pi * R * R; // что за 'S'? неправильное наименование
        boolean result = true; // result не читается как вопрос с ответом да/нет:
        return S; // соответсвенно и здесь поменять 'S' как и в седьмой строке
    }

    public static void main(String[] args) {
        double MyRadius = 5; // 'my...' c маленькой буквы
        System.out.println(CalculateCircleArea(MyRadius)); // и здесь соответсвенно не забыть поменять с маленькой буквы 'calcu...' и 'my...'
    }
}
//Задача 1 — Правильный вариант
/*
public class StudentCalculator {
    public static final double PI = 3.14;

    public static double calculateCircleArea(double radius) {
        double circleArea = PI * radius * radius;
        boolean result = true;
        return circleArea;
    }

    public static void main(String[] args) {
        double myRadius = 5;
        System.out.println(calculateCircleArea(myRadius));
    }
}
*/
