/* 7. Пользователь вводит 10 строк. Те из них, в которых есть восклицательный знак, вывед
      ите в stderr. Попробуйте использовать цикл. */

import java.util.Scanner;

public class T1_Y9_Homework_7 {
    public static void main(String[] args) {
        int step =0;
        Scanner scanner = new Scanner(System.in);
        while (step <10 ){
            System.out.println("Введите строку:");
            String str = scanner.nextLine();
            if (str.contains("!")) System.err.println(str);
            step ++;
        }

    }
}
