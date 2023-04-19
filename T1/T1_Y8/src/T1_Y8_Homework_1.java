import java.util.Scanner;

public class T1_Y8_Homework_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int max;
        if (x>y){                  // Первоначальный вариант
            max = x;
        } else {
            max = y;
        }
        System.out.println("Max is " + max);

        max = (x>y) ? x : y;          // Короткий тип записи с использованием тернарного оператора
        System.out.println("Max is " + max);




    }


}
