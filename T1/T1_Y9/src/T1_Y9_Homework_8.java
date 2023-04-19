import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/* 8. Пользователь вводит 10 строк, потом число max. Вывести в stdout те строки, длинна которых меньше max,
       а в stderr те, длинна которых больше, обрезав по max.*/
public class T1_Y9_Homework_8 {
    public static void main(String[] args) throws IOException {

        int step = 1;
        String str;
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("F:\\Java\\T1_Y9_Homework\\src\\file_4.txt");
        System.out.println("Введите 10 строк: ");
        while (step < 4) {
            System.out.print(step + ":" );
            str = scanner.nextLine();
            writer.println(str);
            step++;
        }
        writer.close();
        System.out.print("Введите максимальное число max = ");
        int max = scanner.nextInt();
        step = 1;

        InputStream stream = new FileInputStream("F:\\Java\\T1_Y9_Homework\\src\\file_4.txt");
        Scanner scanner_1 = new Scanner(stream);
        while (step <4) {
           str = scanner_1.nextLine();
           if (str.length() < max) System.out.println(str);
           else System.err.println(str.substring(0,max));
           step ++;
        }

    }
}
