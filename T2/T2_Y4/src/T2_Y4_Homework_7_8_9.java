// 7.Пользователь вводит букву. Выведите любое слово, начинающуюся на эту букву.
// 8.Пользователь вводит цифру. Выведите страну, телефонный код которого начинается на эту цифру.
// 9.Пользователь вводит цифру. Если она от 0 до 6 -пусть вводит еще. Если 9 -конец.
//   Если 7,8 -пусть вводит строки до тех пор, пока не введет «стоп» (на этом все).

import java.io.IOException;
import java.util.Scanner;

public class T2_Y4_Homework_7_8_9 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите букуву: ");
        char letter = (char) System.in.read();
        switch (letter) {
            case 'a':
                System.out.println("apple");
                break;
            case 'b':
                System.out.println("book");
                break;
            case 'c':
                System.out.println("cat");
                break;
            case 'd':
                System.out.println("dog");
                break;
            case 'f':
                System.out.println("foot");
                break;
            default:
                System.out.println("Нет такой буквы");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одну цифру: ");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                System.out.println("США");
                break;
            case 2:
                System.out.println("Египет");
                break;
            case 3:
                System.out.println("Греция");
                break;
            case 4:
                System.out.println("Румыния");
                break;
            case 5:
                System.out.println("Белиз");
                break;
            default:
                System.out.println("Нет такой страны");
        }

        System.out.println("Введите цифру: ");
        x = scanner.nextInt();
        boolean end = false;
        String str;
        do {
            switch (x) {
                case 0:
                    end = false;
                case 1:
                    end = false;
                case 2:
                    end = false;
                case 3:
                    end = false;
                case 4:
                    end = false;
                case 5:
                    end = false;
                case 6:
                    end = false;
                    System.out.println("Введите цифру еще раз: ");
                    x = scanner.nextInt();
                    break;
                case 7:
                    end = false;
                case 8:
                    end = false;
                    do {
                        System.out.println("Введите строку: ");
                        str = scanner.nextLine();
                    } while (!str.equals("стоп"));
                case 9:
                    end = true;
                    break;
                default:
                    System.out.println("Нет такой цифры");
            }


        } while (!end);
        System.out.println("Конец");


    }
}
