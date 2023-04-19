import java.util.Scanner;

//  1.Напишите метод, который возвращает наибольшее из двух целых чисел.
//  2.Напишите метод, который возвращает наибольшее из двух дробных чисел.
public class T3_Y2_Homework_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int x = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int y = scanner.nextInt();
        System.out.println("Максимальное число = " + max(x,y) );

        System.out.println("Введите первое дробное число: ");
        double z = scanner.nextDouble();
        System.out.println("Введите второе дробное число: ");
        double h = scanner.nextDouble();
        System.out.println("Максимальное число = " + doubleMax(z,h) );

        }
    static int max(int a, int d){
        int intMax = a > d ? a : d;
        return intMax;
    }
    static double doubleMax(double a, double d){
        double douMax = a > d ? a : d;
        return douMax;
    }
}
