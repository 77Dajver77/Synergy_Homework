// 11 Пользователь вводит 3 числа. Сделайте три boolean переменных: есть ли среди введённых четное, есть ли среди введённых отрицательное, есть ли число больше тысячи

import java.util.Scanner;


public class T1_Y3_Homework_11 {
    public static void main(String[] args) {
        System.out.println("Введите первое число ");
        Scanner firstNumber = new Scanner(System.in);
        double x = firstNumber.nextDouble();

        System.out.println("Введите первое число ");
        Scanner secondNumber = new Scanner(System.in);
        double y = secondNumber.nextDouble();

        System.out.println("Введите третье число ");
        Scanner thirdNumber = new Scanner(System.in);
        double z = thirdNumber.nextDouble();

        boolean even = false, negative = false, big = false;

        if (x % 2 + y % 2 + z % 2 == 0) {    // Проверка на четность
            even = true;
        }


        if (Math.signum(x)< 0) {       // Проверка на отрицательные значения
          negative = true;
        }
        if (Math.signum(y)< 0) {
            negative = true;
        }
        if (Math.signum(z)< 0) {
            negative = true;
        }

        if (x > 1000) {             // Проверка на значение больше 1000
            big = true;
        }
        if (y > 1000) {
            big = true;
        }
        if (z > 1000) {
            big = true;
        }
    }
}
