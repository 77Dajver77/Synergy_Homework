// 12. Пользователь вводит три строки, используя .substring(0, x) выведите эти строки, обрезав те, что длиннее самой короткой.

import java.util.Scanner;


public class T1_Y3_Homework_12 {
    public static void main(String[] args) {
        Scanner firstLine = new Scanner(System.in);
        System.out.print("Введите первую строку ");
        String line_1 = firstLine.nextLine();

        Scanner secondLine = new Scanner(System.in);
        System.out.print("Введите второую строку ");
        String line_2 = secondLine.nextLine();

        Scanner thirdLine = new Scanner(System.in);
        System.out.print("Введите третью строку ");
        String line_3 = thirdLine.nextLine();

        int x= line_1.length();

        if (x > line_2.length()) {
            x=line_2.length();
        }
        if (x>line_3.length()) {
            x=line_3.length();
        }

        System.out.println(line_1.substring(0,x));
        System.out.println(line_2.substring(0,x));
        System.out.println(line_3.substring(0,x));




    }
}
