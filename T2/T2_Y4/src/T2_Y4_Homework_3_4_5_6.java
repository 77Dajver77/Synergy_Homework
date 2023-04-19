//  3. Пользователь вводит строку, выведите каждый второй символ (подсказка: str.charAt(i) )
//  4. Пользователь вводит строку. Выводите все слова на разных строках.
//  5. Пользователь вводит строку. Выведите первые 3 слова.
//  6. Пользователь вводит строку, выведите ее задом-наперёд.

import java.util.Scanner;

public class T2_Y4_Homework_3_4_5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        int x = 1;

        do {
            System.out.println(str.charAt(x));                   //Вывод каждого второго символа строки
            x = x + 2;
        } while (str.length() > x);

        x = 0;
        int startIndex = 0, endIndex = 0;
        String world;
        do {
            if (str.charAt(x) == ' '){
               endIndex = x;
               world = str.substring(startIndex, endIndex);
               startIndex = endIndex+1;
               System.out.println(world);                       // Вывод слов на разных строках
            }
           x++;
        }  while (str.length() > x);
        System.out.println(str.substring(endIndex+1,str.length() ));

        int space = 0;
        startIndex = 0;
        endIndex = 0;
        x = 0;
        do {
            if (str.charAt(x) == ' '){
                endIndex = x;
                world = str.substring(startIndex, endIndex);
                startIndex = endIndex+1;
                System.out.print(world + " ");                       // Вывод первых трех слов
                space++;
            }
            x++;
        }  while ((str.length() > x) && !(space == 3));
        System.out.println();

        endIndex = str.length()-1;
        do {
            System.out.print(str.charAt(endIndex));                // Вывод строк задом-наперед
            endIndex--;
        } while (!(endIndex ==0));
    }
}
