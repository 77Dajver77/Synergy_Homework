//3.  Напишите метод, который возвращает самую длинную из трех строк.
//4.  Из четырёх.
//5.  Из пяти. Хочется как-то оптимизировать?:) это хорошо, сможем, когда изучим varar.
//6.  Напишите метод, который возвращает входящую строку, делая ее ЗаБоРчИкОм.

import java.util.Scanner;

public class T3_Y2_Homework_3_4_5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = scanner.nextLine();
        System.out.println("Самая длинная из трёх введенных строк: " + symStr3(str1, str2, str3));
        System.out.println("Введите четвертую строку: ");
        String str4 = scanner.nextLine();
        System.out.println("Самая длинная из трёх введенных строк: " + symStr4(str1, str2, str3, str4));
        System.out.println("Введите пятую строку: ");
        String str5 = scanner.nextLine();
        System.out.println("Самая длинная из трёх введенных строк: " + symStr5(str1, str2, str3, str4, str5));
        System.out.println(symStr(str1));

    }
    static String symStr3 (String str1, String str2, String str3){
        String lengthStr = str1.length() > str2.length() ? str1 : str2;
        lengthStr = lengthStr.length() > str3.length() ? lengthStr : str3;
        return lengthStr;
    }

    static String symStr4 (String str1, String str2, String str3, String str4){
        String lengthStr = str1.length() > str2.length() ? str1 : str2;
        lengthStr = lengthStr.length() > str3.length() ? lengthStr : str3;
        lengthStr = lengthStr.length() > str4.length() ? lengthStr : str4;
        return lengthStr;
    }

    static String symStr5 (String str1, String str2, String str3, String str4, String str5){
        String lengthStr = str1.length() > str2.length() ? str1 : str2;
        lengthStr = lengthStr.length() > str3.length() ? lengthStr : str3;
        lengthStr = lengthStr.length() > str4.length() ? lengthStr : str4;
        lengthStr = lengthStr.length() > str5.length() ? lengthStr : str5;
        return lengthStr;
    }

    static String symStr (String str1){
       char[] arrayChar = str1.toCharArray();
       for (int x = 0; x < arrayChar.length; x = x + 2){
        arrayChar[x] =Character.toUpperCase(arrayChar[x]);
       }
       String uperStr = new String(arrayChar);
       return uperStr;
    }


}
