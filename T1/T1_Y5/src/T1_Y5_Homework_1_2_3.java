
// 1. Пользователь вводит два числа. Возвести второе в степень первого.
// 2. Пользователь вводит три числа. Возвести 1 в степень 2, и результат в степень 3.
// 3. Решить предыдущую задачу, но Math.pow можно использовать только на одной строчке вашей программы(хоть и много раз)

import java.util.Scanner;

public class T1_Y5_Homework_1_2_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первое число = ");
        int num_1 = num.nextInt();
        System.out.println("Введите второе число = ");
        int num_2 = num.nextInt();
        System.out.println("Второе число в степени первого " + num_2 + "^" + num_1 + " = " + Math.pow(num_2, num_1));
        System.out.println();

        System.out.println("Введите первое число = ");        // Возвести 1 в степень 2, и результат в степень 3
        num_1 = num.nextInt();
        System.out.println("Введите второе число = ");
        num_2 = num.nextInt();
        System.out.println("Введите третье число = ");
        int num_3 = num.nextInt();
        double num_4 = Math.pow(num_1,num_2);
        System.out.println("Результат вычеслений = " + Math.pow(num_4,num_3));
        System.out.println();

        System.out.println("Введите первое число = ");        // Math.pow можно использовать только на одной строчке программы
        num_1 = num.nextInt();
        System.out.println("Введите второе число = ");
        num_2 = num.nextInt();
        System.out.println("Введите третье число = ");
        num_3 = num.nextInt();
        System.out.println("Результат вычеслений = " + Math.pow(Math.pow(num_1,num_2),num_3));

    }
}
