import java.util.Scanner;

//1.  Пользователь вводит 10 слов в массив. Найдите первое слово, в котором есть две гласные буквы подряд.
//2.  Пользователь вводит массив чисел. Найдите первое четное число.
//3.  Найдите первое чётное число в массиве, которое больше 100.
//4.  Найдите последнее слово в массиве, которое написано ЗаБоРчИкОм (что б узнать, заглавная ли буква, используйте Character.isUpperCase(letter) )
public class T3_Y6_Homework_1_2_3_4 {
    public static void main(String[] args) {
        String[] str = new String[10];
        Scanner scanner = new Scanner(System.in);
        boolean twoVowel = false;

        for (int x = 0; x < 10; x++) {
            System.out.println("Введите слово: ");
            str[x] = scanner.next();
            for (int y = 0; y < str[x].length() - 1; y++) {
                if (charVowel(str[x].charAt(y)) && charVowel(str[x].charAt(y + 1))) {
                    twoVowel = true;
                    System.out.println("В слове " + str[x] + " есть две гласные буквы подряд");
                    break;
                }
            }
            if (twoVowel){
                break;
            }
        }
        if (!twoVowel){
            System.out.println("В веденных словах нет слова с двумя подряд гласными буквами");

        }
        int[] number = new int[10];
        int ostatok = 0;
        Scanner scanner1 = new Scanner(System.in);
        for (int x = 0; x < 10; x++) {
            System.out.println("Введите число: ");
            number[x] = scanner1.nextInt();
        }
        for (int x = 0; x < 10; x++) {
            if (ostatok == number[x] % 2){
                System.out.println("Первое четное число " + number[x]);
                break;
            }
            if (x == 9){
                System.out.println("Четных чисел нет");
            }
        }
        for (int x = 0; x < 10; x++) {
            if ((ostatok == number[x] % 2) && (number[x] >100)){
                System.out.println("Первое четное число больше 100" + number[x]);
                break;
            }
            if (x == 9){
                System.out.println("Четных чисел больше 100 нет");
            }
        }

    }

    public static boolean charVowel(char word) {
        boolean flag = false;
        int i = 0;
        char[] charVowel = new char[]{'а', 'у', 'е', 'о', 'э', 'я', 'и', 'ю'};
        do {
            flag = (word == charVowel[i]) ? true : false;
            i++;
        } while (!flag && i < 8);
        return flag;
    }
}
