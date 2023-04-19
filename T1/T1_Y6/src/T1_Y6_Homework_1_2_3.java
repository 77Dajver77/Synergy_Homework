

// 1.Пользователь вводит дробное число. Если оно больше пи, вывести “pimore”
// 2.Пользователь вводит строку. Используя метод .contains(‘ ‘) пробел, определите, ввел пользователь одно слово, или больше
// 3.Пользователь вводит четыре числа. Найти наибольшее из них.

import java.util.Scanner;

public class T1_Y6_Homework_1_2_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        double num_1 = num.nextDouble();
        if (num_1 > Math.PI) System.out.println("pimore");
        System.out.println();

        System.out.print("Введите строку: ");  // Определяем сколько слов ввел пользователь
        Scanner ch = new Scanner(System.in);
        String str = ch.nextLine();
        if (str.contains(" ")) System.out.println("Вы ввели два и более слов");
        else System.out.println("Вы ввели одно слово");
        System.out.println();

        System.out.print("Введите первое число: ");   // Находим наибольшее число из четырех введенных
        num_1 = num.nextDouble();
        System.out.print("Введите второе число: ");
        double num_2 = num.nextDouble();
        System.out.print("Введите третье число: ");
        double num_3 = num.nextDouble();
        System.out.print("Введите четвертое число: ");
        double num_4 = num.nextDouble();
        if (num_1<num_2) num_1=num_2;
        if (num_3<num_4) num_3=num_4;
        if (num_1<num_3) num_1=num_3;
        System.out.println("Наибольшее число из четырех введенных = " + num_1);
    }
}
