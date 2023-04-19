// 4.Пользователь вводит, две строки. Найти разницу в длине.
// 5.Пользователь вводит три строки. Найти разницу в длине самой короткой и самой длинной.
// 6. Решить предыдущую задачу, не используя операторы >,< итд.


import java.util.Scanner;

public class T1_Y5_Homework_4_5_6 {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);          // Пользователь вводит, две строки. Найти разницу в длине.
        System.out.println("Введите первую строку: ");
        String str = string.nextLine();
        System.out.println("Введите вторую строку: ");
        String str_2 = string.nextLine();
        System.out.println("Разница в длине строк составляет: " + Math.abs(str.length() - str_2.length()));

        System.out.println();                             // Пользователь вводит три строки. Найти разницу в длине самой короткой и самой длинной.
        System.out.println("Введите первую строку: ");
        str = string.nextLine();
        System.out.println("Введите вторую строку: ");
        str_2 = string.nextLine();
        System.out.println("Введите третью строку: ");
        String str_3 = string.nextLine();
        int min, max;
        if (str.length() > str_2.length()) {                // Находим минимально длинную строку
            min = str_2.length();
            if (min > str_3.length()) {
                min = str_3.length();
            }
        } else if (str.length() > str_3.length()) {
            min = str_3.length();
        } else min = str.length();

        if (str.length() < str_2.length()) {                // Находим максимально длинную строку
            max = str_2.length();
            if (max < str_3.length()) {
                max = str_3.length();
            }
        } else if (str.length() < str_3.length()) {
            max = str_3.length();
        } else max = str.length();
        System.out.println("Разница между минимальной и максимальной длинной строк составляет: " + (max-min));

        max = Math.max(str.length(),str_2.length());       // Решить предыдущую задачу, не используя операторы >,< итд.
        max = Math.max(max,str_3.length());
        min = Math.min(str.length(),str_2.length());
        min = Math.min(max,str_3.length());
        System.out.println("Разница между минимальной и максимальной длинной строк составляет: " + (max-min));

    }
}
