// Задать две строковых переменных. Найти, какая из них длиннее. (Используйте .length() )

public class T1_Y2_Homework_15 {
    public static void main(String[] args) {
        String line1 = "Первыая строка длиннее";
        String line2 = "Вторая строка длиннее";
        if (line1.length() > line2.length()) {
            System.out.println(line1);
        }
        if (line1.length() < line2.length()) {
            System.out.println(line2);
        }
    }
}
