import java.util.Scanner;

/* 13. Мини - игра в слова. Первый игрок вводит слово. Потом второй
       игрок вводит два числа, с какого по какой символ можно найти слово внутри
       исходного, используя substring. Потом первый игрок вводит два числа.
       Побеждает тот, чье слово длиннее. */
public class T1_Y3_Homework_13 {
    public static void main(String[] args) {
    int x, y, number_1 = 0, number_2 = 0;
        System.out.print("1: ");
        Scanner word = new Scanner(System.in);
        String word_1 = word.nextLine();

        System.out.print("2: ");

        Scanner number = new Scanner(System.in);
        number_1 = number.nextInt();
        number_2 = number.nextInt();
        System.out.println(word_1.substring(number_1, number_2));
        String firstPlayer = word_1.substring(number_1, number_2);

        System.out.print("1: ");
        number_1 = number.nextInt();
        number_2 = number.nextInt();
        number.close();
        System.out.println(word_1.substring(number_1, number_2));
        String secondPlayer = word_1.substring(number_1, number_2);
        if (firstPlayer.length() > secondPlayer.length()) {
            System.out.println("Победил игрок 1 ");
        }
        else {
            System.out.println("Победил игрок 2 ");

        }









    }
}
