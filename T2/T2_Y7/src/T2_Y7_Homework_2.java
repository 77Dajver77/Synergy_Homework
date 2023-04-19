import java.util.Scanner;

// 2. Посчитайте количество нулей в числе.
public class T2_Y7_Homework_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String number = scanner.next();
        int numberZero = 0;
        for (int x = 0; x < number.length(); x++) {
            if (number.charAt(x) == '0') {
                numberZero++;
            }
        }
        System.out.println("Количество нулей в веденном числе ровно: " + numberZero);
    }
}
