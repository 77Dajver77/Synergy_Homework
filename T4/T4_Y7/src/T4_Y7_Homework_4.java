import java.util.Scanner;

//4.  Доработайте калькулятор. Если пользователь ввел неверное значение, просто дайте ему ввести еще раз. (Пока он не введёт корректно)

public class T4_Y7_Homework_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_1=0, num_2=0, num_3=0;

        num_1 = getNumber(num_1);
        System.out.println("Введите оператор: ");
        char ch_1 = scanner.next().charAt(0);
        num_2 = getNumber(num_2);
        System.out.println("Введите оператор: ");
        char ch_2 = scanner.next().charAt(0);
        num_3 = getNumber(num_3);
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



    }

    private static int getNumber(int num_1) {
        boolean b;

        do{
            try{
                System.out.println("Введите  число: ");
                Scanner scanner = new Scanner(System.in);
                num_1 = scanner.nextInt();
                b = false;
            }catch (Exception e) {
                System.out.println("Введено не корректное число");
                b = true;

            }
        } while (b);
        return num_1;
    }
}
