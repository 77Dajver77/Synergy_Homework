/* 7. Сделать калькулятор для трех чисел: пользователь вводит первое, потом
      оператор, второе, оператор, третье. Посчитать первое на второе, потом
      результат с третьим. Пример:
      11
       +
       4
       *
       20
       Вывод: 300 */
/* 8. Решить предыдущую задачу, но операции считать по приоритету (умножение и деление выше сложения вычитания).
      Предыдущий пример даст ответ 11 + 80 равно 91 */

import java.util.Scanner;

public class T1_Y5_Homework_7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num_1 = scanner.nextInt();
        System.out.println("Введите оператор: ");
        char ch_1 = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        int num_2 = scanner.nextInt();
        System.out.println("Введите оператор: ");
        char ch_2 = scanner.next().charAt(0);
        System.out.println("Введите третье число: ");
        int num_3 = scanner.nextInt();
        double rezultat = 0;
        if (ch_1 == '+') rezultat = num_1 + num_2;
        if (ch_1 == '-') rezultat = num_1 - num_2;
        if (ch_1 == '*') rezultat = num_1 * num_2;
        if (ch_1 == '/') rezultat = num_1 / num_2;
        if (ch_2 == '+') rezultat = rezultat + num_3;
        if (ch_2 == '-') rezultat = rezultat - num_3;
        if (ch_2 == '*') rezultat = rezultat * num_3;
        if (ch_2 == '/') rezultat = rezultat / num_3;
        System.out.println("Результат вычислений = " + rezultat);

        rezultat = 0;                           // Решить предыдущую задачу, но операции считать по приоритету (умножение и деление выше сложения вычитания).
        boolean flag = false;
        if (ch_2 == '*')  flag = true;
        if (ch_2 == '/')  flag = true;
        if (ch_1 == '*')  flag = false;
        if (ch_1 == '/')  flag = false;
        if (flag) {
            if (ch_2 == '*') rezultat = num_2 * num_3;
            if (ch_2 == '/') rezultat = num_2 / num_3;
            if (ch_1 == '+') rezultat = num_1 + rezultat;
            if (ch_1 == '-') rezultat = num_1 - rezultat;
        } else {
            if (ch_1 == '+') rezultat = num_1 + num_2;
            if (ch_1 == '-') rezultat = num_1 - num_2;
            if (ch_1 == '*') rezultat = num_1 * num_2;
            if (ch_1 == '/') rezultat = num_1 / num_2;
            if (ch_2 == '+') rezultat = rezultat + num_3;
            if (ch_2 == '-') rezultat = rezultat - num_3;
            if (ch_2 == '*') rezultat = rezultat * num_3;
            if (ch_2 == '/') rezultat = rezultat / num_3;

        }
        System.out.println("Результат вычислений = " + rezultat);
    }
}
