//3.  Возьмите любую программу, которую вы писали до этого.. какая сердцу ближе. Отрефакторите ее (улучшите читабельность кода)
//    - путем разбиения крупных частей на методы поменьше. Стало лучше? (надеюсь, да)
//       Задание из Т1_У3
//        double x, y;
//        Scanner firstNumber = new Scanner(System.in);
//        System.out.print("Введите первое число ");
//        x = firstNumber.nextInt();
//        Scanner secondNumber = new Scanner(System.in);
//        System.out.print("Введите второе число ");
//        y = firstNumber.nextInt();
//        if (x > y ) {
//        System.out.println(y/x);
//        }
//        if (x == y) {
//        System.out.println("Числа равны");
//        }
//        if (x < y) {
//        System.out.println(x / y);
//        }
//
//        }

import java.util.Scanner;

public class T3_Y7_Homework_3 {
    public static void main(String[] args) {
        double x = getRequest();
        double y = getRequest();
        getResult(x,y);
    }

    private static void getResult(double x, double y) {
        if (x > y) {
        System.out.println(y / x);
        }
        if (x == y) {
        System.out.println("Числа равны");
        }
        if (x < y) {
        System.out.println(x / y);
        }
    }

    static double getRequest() {
        Scanner number = new Scanner(System.in);
        System.out.print("Введите число ");
        double x = number.nextInt();
        return x;

    }


}


