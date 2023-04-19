//  7. Предыдущее задание, но если пользователь ввел хотя бы часть слова верно,
//     то писать: горячо. (Проверять с помощью str.contains).

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class T2_Y2_Homework_7 {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream stream = new FileInputStream("F:\\Java\\T2_Y2_Homework\\files\\Game");
        Scanner scanner = new Scanner(stream);
        String strLetterPuzzle = scanner.nextLine();
        String strLetterPrompt = scanner.nextLine();
        System.out.println("Подсказка " + strLetterPrompt);
        System.out.println("Введите секретное слово: ");
        Scanner scannerLetter = new Scanner(System.in);
        String letter = scannerLetter.nextLine();
        while (! strLetterPuzzle.equals(letter)) {
            if (strLetterPuzzle.contains(letter)) {
                System.out.println("Горячо");
            } else {
                System.out.println("Не угадали");
            }
            System.out.println("Попробуйте еще раз: ");
            letter = scannerLetter.nextLine();
        }
        System.out.println("Верно");
    }
}
