// 5. Пользователь вводит три дробных числа. Вывести те из них, квадратный корень которых меньше 2.

import java.util.Scanner;

public class T1_Y3_Homework_5 {
    public static void main(String[] args) {
        System.out.print("Введите первое дробное число = ");
        Scanner первоеДробноеЧисло = new Scanner(System.in);
        double x = первоеДробноеЧисло.nextDouble();

        System.out.print("Введите второе дробное число = ");
        Scanner второеДробноеЧисло = new Scanner(System.in);
        double y = второеДробноеЧисло.nextDouble();

        System.out.print("Введите третье дробное число = ");
        Scanner третьеДробноеЧисло = new Scanner(System.in);
        double z = третьеДробноеЧисло.nextDouble();
        if (Math.sqrt(x)<2) {
            System.out.println("Квадратный корень из первого числа меньше 2 и = " + Math.sqrt(x));
        }
        if (Math.sqrt(y)<2) {
            System.out.println("Квадратный корень из второго числа меньше 2 и = " + Math.sqrt(y));
        }
        if (Math.sqrt(z)<2) {
            System.out.println("Квадратный корень из третьего числа меньше 2 и = " + Math.sqrt(z));
        }

    }
}
