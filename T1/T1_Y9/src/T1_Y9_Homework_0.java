// Пользователь вводит три слова, выведите в обратном порядке.

import java.util.Scanner;

public class T1_Y9_Homework_0 {
    public static void main(String[] args) {
        String string, ch1, ch2, ch3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово: ");          // Первый способ
        ch1 = scanner.next();
        System.out.println("Введите второе слово: ");
        ch2 = scanner.next();
        System.out.println("Введите третье слово: ");
        ch3 = scanner.next();
        System.out.println(ch3 + " " + ch2 + " " + ch1);

        System.out.println("Введите три слова: ");           // Второй способ
        ch1 = scanner.next();
        ch2 = scanner.next();
        ch3 = scanner.next();
        System.out.println(ch3 + " " + ch2 + " " + ch1);
    }
}
