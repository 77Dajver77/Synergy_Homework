// 7.Поле чудес. Игрок один пишет слово. Выводится: ##### (по количеству букв)
//   Игрок два пытается угадать буквы. Если угадал, буква открывается: #а#а#, ба#а#, ... банан

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class T2_Y5_Homework_7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Первый игрок введите слово: ");
        Scanner scanner = new Scanner(System.in);
        String strLetter = scanner.nextLine();

        char letter[] = new char[strLetter.length()];
        char letterPuzzle[] = new char[strLetter.length()];
        char a;
        int flag = 0;
        for (int x = 0; x < strLetter.length(); x++) {
            letter[x] = strLetter.charAt(x);
            letterPuzzle[x] = '#';
        }
        do {
            for (int x = 0; x < strLetter.length(); x++) {
                System.out.print(letterPuzzle[x]);
            }
            System.out.println();
            System.out.println("Второй игрок введите букву: ");
            InputStreamReader scannerChar = new InputStreamReader(System.in);
            a = (char) scannerChar.read();
            for (int x = 0; x < strLetter.length(); x++) {
                if (strLetter.charAt(x) == a) {
                    letterPuzzle[x] = a;
                }
            }
            for (int x = 0; x < strLetter.length(); x++) {
                flag = letterPuzzle[x] != '#' ? flag+1 : 0;
            }
        } while (flag != strLetter.length());
        System.out.println("Вы угадали слово: " + strLetter);
    }
}
