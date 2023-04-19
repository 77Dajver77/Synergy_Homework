// 10. Пользователь вводит полный путь и название файла. Пока пользователь не
//      ввел путь к существующему файлу, повторять ввод.

import java.io.File;
import java.util.Scanner;

public class T2_Y2_Homework_10 {
     public static void main(String[] args) {
        System.out.println("Введите полный путь и название файла: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        File f = new File(str);
        boolean isExist = f.exists();
        while (!isExist) {
            System.out.println("Файл  не существует");
            System.out.println("Введите полный путь и название файла: ");
            str = scanner.nextLine();
            f = new File(str);
            isExist = f.exists();
        }
         System.out.println("Файл существует");
    }
}
