import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/* 4.Используя Scanner на основе FileInputStream, прочесть из файла строку:
     название другого файла. Из этого другого файла прочесть название третьего
     файла, и в третий файл записать букву, которую пользователь введет через
     System.in (без сканера) */
public class T1_Y9_Homework_4 {
    public static void main(String[] args) throws IOException {
        InputStream stream = new FileInputStream("F:\\Java\\T1_Y9_Homework\\src\\file_1.txt");
        Scanner scanner = new Scanner(stream);
        String str_1 = scanner.nextLine();
        stream = new FileInputStream(str_1);
        scanner = new Scanner(stream);
        String str_2 = scanner.nextLine();

        InputStream ch= System.in;
        System.out.println("Введите букву:");
        char char_1 = (char) ch.read();
        PrintWriter writer = new PrintWriter(str_2);
        writer.print(char_1);
        writer.close();

    }
}
