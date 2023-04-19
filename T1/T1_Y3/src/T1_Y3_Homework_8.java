import java.util.Scanner;

// 8. Пользователь вводит два числа. Разделить меньшее на большее и вывести результат.
public class T1_Y3_Homework_8 {
    public static void main(String[] args) {
        double x, y;
        Scanner firstNumber = new Scanner(System.in);
        System.out.print("Введите первое число ");
        x = firstNumber.nextInt();
        Scanner secondNumber = new Scanner(System.in);
        System.out.print("Введите второе число ");
        y = firstNumber.nextInt();
        if (x > y ) {
            System.out.println(y/x);
        }
        if (x == y) {
            System.out.println("Числа равны");
            }
        if (x < y) {
            System.out.println(x / y);
        }

    }
}
