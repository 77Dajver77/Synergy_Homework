import java.awt.*;
import java.io.File;
import java.util.Scanner;

//6.  Пользователь вводит имя файла. Выведите содержимое этого файла, если не получилось - выведите сообщение, что файл не найден.

public class T4_Y7_Homework_6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите имя файла:");
        Scanner scanner = new Scanner(System.in);
        String pathFile = scanner.nextLine();
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(new File(pathFile));
        } catch (Exception e) {
            throw new Exception("Файл не найден");
        }


    }


}