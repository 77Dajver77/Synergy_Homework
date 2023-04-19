// 1. Пользователь вводит три строки, выведите в обратном порядке.

import java.util.Scanner;

public class T1_Y9_Homework_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str_1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String str_2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String str_3 = scanner.nextLine();
        System.out.println(str_3);
        System.out.println(str_2);
        System.out.println(str_1);

    }
}
