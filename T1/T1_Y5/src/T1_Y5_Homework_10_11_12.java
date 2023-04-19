

// 10.Пользователь вводит N. Вывести букву английского алфавита по счету N.
// 11.Вывести слчайную букву английского алфавита.
// 12.Вывести случайное число от 11 до 22

import java.util.Scanner;
public class T1_Y5_Homework_10_11_12 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите N от 1 до 27: ");      //  Пользователь вводит N. Вывести букву английского алфавита по счету N.
        int num_1 = num.nextInt();
        char ch = (char) (num_1 + 96);
        System.out.println(ch);
        System.out.println();

        ch = (char) (Math.floor(Math.random() * 26 + 97));    // Вывести слчайную букву английского алфавита.
        System.out.println("Случайная буква английского алфавита: " + ch);
        System.out.println();

        System.out.println("Случайное число от 11 до 22: " + (Math.floor(Math.random() * 11 + 11)));  // Вывести случайное число от 11 до 22
    }
}
