// 9.  Пока пользователь не введёт строку, содержащую пробел, считывайте
//     строки и выводите их первые буквы

import java.util.Scanner;

public class T2_Y2_Homework_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Первая буква строки: " + str.substring(0,1));
        while (!str.contains(" ")) {
            System.out.println("Введите строку");
            str = scanner.nextLine();
            System.out.println("Первая буква строки: " + str.substring(0,1));
        }
        System.out.println("Введенной строке есть пробел");
    }
}
