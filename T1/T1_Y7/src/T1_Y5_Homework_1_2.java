// Написать простой булев калькулятор.

import java.util.Scanner;

public class T1_Y5_Homework_1_2 {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.println("Введите булево выражение:");
        String str = ch.nextLine();
        char ch_1 = str.charAt(0);
        char oper = str.charAt(1);
        char ch_2 = str.charAt(2);
        boolean booleanCh_1, booleanCh_2;
        if (ch_1 == '0') booleanCh_1 = false;
        else booleanCh_1 = true;
        if (ch_2 == 48 ) booleanCh_2 = false;
        else booleanCh_2 = true;

        if (oper == '&') System.out.println(booleanCh_1 & booleanCh_2);
           else if (oper == '|')System.out.println(booleanCh_1 || booleanCh_2);
                else System.out.println("В белевой логике нет такого оператора");



    }
}
// 