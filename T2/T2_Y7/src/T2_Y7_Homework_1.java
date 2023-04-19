import java.util.Scanner;

// 1. Пользователь вводит пять строк. Выведите слово, состоящие из первой буквы каждый строки.
public class T2_Y7_Homework_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] letter = new char[5];
        for (int x = 0; x < 5; x++){
            System.out.println("Введите строку: ");
            String str = scanner.nextLine();
            letter[x] = str.charAt(0);
        }
        for (int x = 0; x <5; x++){
            System.out.print(letter[x]);
        }
    }
}
