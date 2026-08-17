package library.block_2.task2_1;

public class StudentProfile {
    public static void main(String[] args) {
        char firstLetterOfName = 'A';
        byte currentGrade = 88;
        short studentId = 23981;
        int birthYear = 1996;
        long phoneNumber = 79119876543L;
        float averageScore = 4.15f;
        double finalScore = 4.34;
        boolean isTuitionPaid = true;

        System.out.println("Профиль студента");
        System.out.println("Первая буква имени: " + firstLetterOfName);
        System.out.println("ID студенческого билета: " + studentId);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("Номер телефона: +" + phoneNumber);
        System.out.println("Текущая оценка (0-100): " + currentGrade);
        System.out.println("Средний балл за прошлый семестр: " + averageScore);
        System.out.println("Итоговый балл: " + finalScore);
        System.out.println("Оплата обучения произведена: " + isTuitionPaid);
    }
}

